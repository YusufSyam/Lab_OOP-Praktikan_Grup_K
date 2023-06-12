import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class No1 {

    public static void main(String[] args) {
        int numData = 4;

        UiThread uiThread = new UiThread(numData);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        uiThread.start();

        for (int i = 0; i < numData; i++) {
            executor.execute(new BackgroundThread(uiThread, TaskTimeHelper.generateRandomTimeExecution()));
        }
        executor.shutdown();
    }
}

class UiThread extends Thread {
    private int numBackgroundThreads;
    private int numThreadsSuccess = 0;
    private int numThreadsFailed = 0;
    private int timeExecution = 0;

    public UiThread(int numBackgroundThreads) {
        this.numBackgroundThreads = numBackgroundThreads;
    }

    public void run() {
        System.out.println("Start load " + numBackgroundThreads + " Data");
        while ((numThreadsSuccess + numThreadsFailed) < numBackgroundThreads) {
            try {
                Thread.sleep(1000);
                timeExecution++;
                System.out.printf("Loading... (%ds)\n", timeExecution);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nTask Finish.");
        System.out.println("Time Execution : " + timeExecution + "s");
        if (numThreadsFailed == 0) {
            System.out.println("All data is successfully loaded");
        } else if (numThreadsSuccess == 0) {
            System.out.println("All data failed to load");
        } else {
            System.out.println(
                    numThreadsSuccess + " Data Successfully loaded  & " + numThreadsFailed + " Data failed to load");
        }
    }

    public synchronized void incrementNumThreadsSuccess() {
        this.numThreadsSuccess++;
    }

    public synchronized void incrementNumThreadsFailed() {
        this.numThreadsFailed++;
    }
}

class BackgroundThread extends Thread {
    private UiThread uiThread;
    private int timeExecution;

    public BackgroundThread(UiThread uiThread, int timeExecution) {
        this.uiThread = uiThread;
        this.timeExecution = timeExecution;
    }

    public void run() {
        try {
            for (int i = 1; i <= timeExecution; i++) {
                TimeUnit.SECONDS.sleep(1);
                if (i * 1000 > 2000) {
                    System.out.println("Request Timeout");
                    uiThread.incrementNumThreadsFailed();
                    return;
                }
            }
            uiThread.incrementNumThreadsSuccess();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class TaskTimeHelper {
    static int generateRandomTimeExecution() {
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
        return randomNumber;
    }
}
