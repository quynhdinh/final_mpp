package Final;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threading{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for(int i = 0; i < 20; i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Sending important message");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                
            });
        }
        executorService.shutdown();
    }
}