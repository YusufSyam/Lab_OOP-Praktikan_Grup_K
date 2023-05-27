import java.util.ArrayList;
import java.util.Random;

class TaskTimeHelper{
    public static int getRandom(){
        Random random = new Random();
        int num = random.nextInt(1,6);
        return num;
    }
}

public class Main {

    public static void main(String[] args) {
        ArrayList<String> dataSources = new ArrayList<>();
        dataSources.add("Source A");
        dataSources.add("Source B");
        dataSources.add("Source C");
        dataSources.add("Source D");

        UiThread uiThread = new UiThread(dataSources);
        uiThread.start();
    }
}

class UiThread extends Thread {
    ArrayList<String> datas;
    ArrayList<BgThread> threads;
    boolean finish;

    public UiThread(ArrayList<String> datas) {
        this.datas = datas;
        this.threads = new ArrayList<>();
        this.finish = false;
    }

    @Override
    public void run() {
        System.out.println("Start load " + datas.size() + " Data");

        for (String data : datas) {
            BgThread thread = new BgThread(data);
            threads.add(thread);
            thread.start();
        }

        while (!this.finish) {
            this.finish = true;
            for (BgThread thread : threads) {
                if (!thread.isLoaded()) {
                    this.finish = false;
                    System.out.println("Loading... " + thread.getExecutionTime() + "s");
                }
            }
        }

        int totalExecutionTime = 0;
        int successfullyLoaded = 0;
        int failedToLoad = 0;

        for (BgThread thread : threads) {
            totalExecutionTime += thread.getExecutionTime();
            if (thread.isLoaded()) {
                successfullyLoaded++;
            } else {
                failedToLoad++;
            }
        }

        System.out.println("Task Finish.");
        System.out.println("Time Execution: " + totalExecutionTime + "s");
        System.out.println(successfullyLoaded + " Data Successfully Loaded & " + failedToLoad + " Data failed to load.");
    }
}

class BgThread extends Thread {
    int executionTime;
    String data;
    boolean isLoaded;

    public BgThread(String data) {
        this.executionTime = TaskTimeHelper.getRandom();
        this.data = data;
        this.isLoaded = false;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    @Override
    public void run() {
        try {
            System.out.println("Loading data from " + data);
            Thread.sleep(executionTime * 1000);
            isLoaded = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
