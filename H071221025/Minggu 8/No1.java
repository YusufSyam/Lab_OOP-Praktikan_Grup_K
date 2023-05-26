import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class No1 {
    private int dataSources;
    private int threadPools;
    private List<Integer> loadedData;
    private List<Integer> failedData;

    public No1(int dataSources, int threadPools) {
        this.dataSources = dataSources;
        this.threadPools = threadPools;
        this.loadedData = new ArrayList<>();
        this.failedData = new ArrayList<>();
    }

    public void start() {
        System.out.println("Start load " + dataSources + " Data.\n");
        ExecutorService executor = Executors.newFixedThreadPool(threadPools);
        for (int i = 0; i < dataSources; i++) {
            executor.execute(new LoadDataTask(i));
        }
        executor.shutdown();
        Thread uiThread = new Thread(new UIThread());
        uiThread.start();
        while (!executor.isTerminated()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            uiThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private class LoadDataTask implements Runnable {
        private int sourceId;
        public LoadDataTask(int sourceId) {
            this.sourceId = sourceId;
        }

        @Override
        public void run() {
            int taskTime = TaskTimeHelper.generateTaskTime();
            try {
                Thread.sleep(taskTime * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (taskTime > 4) {
                System.out.println("Request Timeout");
                failedData.add(sourceId);
            } else {
                loadedData.add(sourceId);
            }
        }
    }

    private static class TaskTimeHelper {
        public static int generateTaskTime() {
            Random rand = new Random();
            return rand.nextInt(6) + 1;
        }
    }

    private class UIThread implements Runnable {
        @Override
        public void run() {
            int totalTime = 0;
            while (loadedData.size() + failedData.size() < dataSources) {
                try {
                    Thread.sleep(1000);
                    totalTime++;
                    System.out.println("Loading... (" + totalTime + "s)");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            int totalLoaded = loadedData.size();
            int totalFailed = failedData.size();

            if (totalFailed > 0) {
                System.out.println("\nTask Finish.\nTime Execution: " + totalTime + "s\n\n"
                        + totalLoaded + " Data Successfully Loaded & " + totalFailed + " Data failed to load.\n");
            } else {
                System.out.println("\nTask Finish.\nTime Execution: " + totalTime + "s\nAll data is successfully loaded\n");
            }
        }
    }

    public static void main(String[] args) {
        No1 dataLoader = new No1(4, 3);
        dataLoader.start();
    }
}