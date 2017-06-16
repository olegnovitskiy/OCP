package com.ocp.chapter7.executors;

import java.util.concurrent.*;

/**
 * Created by olegnovitskiy on 6/14/17.
 */
public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(
                    () -> {
                        for (int i = 0; i < 500; i++) {
                            CheckResults.counter++;
                            
                        }
                    });

            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached!");
        }
        catch (TimeoutException e) {
            System.out.println("Not reached at time!");
        }
        finally {
            if (service != null) {
                service.shutdown();
            }
        }

        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                CheckResults.counter++;
            }
        }
        ).start();

        while (CheckResults.counter < 100) {
            System.out.println("Not reached yet!");
//            sleep(1000);
        }
        System.out.println("Finished");

    }
}
