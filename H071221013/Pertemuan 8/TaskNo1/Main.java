package TaskNo1;

import java.util.Random;
import java.util.concurrent.ExecutorService;    
import java.util.concurrent.Executors;  

public class Main {
    private static final int sumberData = 4;  
    private static final int perulanganData = 3; 
    private static int loadData = 0; 
    private static int failedLoadData = 0; 
    private static boolean isFinished = false;     

    class TaskTimeHelper {  
        public static int getRandomNumber() {   
            Random random = new Random();   
            return random.nextInt(6) + 1;   
        }
    }

    public static void main(String[] args) {
        System.out.println(String.format("Start load %d Data", sumberData));

        // Background Thread
        ExecutorService executor = Executors.newFixedThreadPool(perulanganData);

        for (int i = 0; i < sumberData; i++) {
            executor.execute(() -> { 
                int executionTime = TaskTimeHelper.getRandomNumber();
               
                if (executionTime > 4) {
                    System.out.println("Request Timeout");
                   
                    incrementFailedLoadData();  
                    return;
                } else {
                    try {
                        Thread.sleep(executionTime * 1000);
                        incrementSuccessLoadData();
                    } catch (InterruptedException e) {
                        incrementFailedLoadData();
                        System.out.println("Request Timeout");
                    }
                }
                checkDataLoadingStatus();   
            });
        }

        executor.shutdown();
        int loadingTime = 1;    
        while (true) { 
            if (isFinished) {   
                System.out.println("\nTask Finished.");
                System.out.println(String.format("Time Execution : %ds", loadingTime - 1)); //untuk menghitung time execution sbnrnya krna awalnya loading time diinisialisasi dengan nilai 1
                
                if (loadData == sumberData) {
                    System.out.println("All data is successfully loaded");  
                    break;  
                } else {
                    System.out.println(String.format("%d Data Successfully loaded & %d Data Failed to load", loadData, failedLoadData));
                    break;
                }
            } else {   
                System.out.println(String.format("Loading... (%ds)", loadingTime));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            loadingTime++;  
        }
    }
    public static synchronized void incrementSuccessLoadData() {
        loadData++;
    }
    public static synchronized void incrementFailedLoadData() {
        failedLoadData++;
    }

    public static synchronized void checkDataLoadingStatus() {
        if (loadData + failedLoadData == sumberData) { 
            isFinished = true;
        }
    }    
}