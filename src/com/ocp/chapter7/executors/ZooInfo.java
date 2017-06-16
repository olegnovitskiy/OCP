package com.ocp.chapter7.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ZooInfo {
    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();

            System.out.println("Begin");
            service.execute(() -> System.out.println("Printing Zoo inventory"));
            service.execute(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Printing record : "+i);
                }
            });
            service.execute(() -> System.out.println("Printing Zoo inventory"));
            System.out.println("End");
        }
        finally {
            if (service != null) {
                service.shutdown();
            }
        }

        Future<?> future = service.submit(() -> System.out.println("Hello all"));


    }
}
