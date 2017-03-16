package com.ocp.assessment;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class BabyPandaBathManager {
    public static void wait(CyclicBarrier cb) {
        try {
            cb.wait();
        } catch (InterruptedException e) {
            ;
        }
//        catch (InterruptedException | BrokenBarrierException e) {
//           ;
//        }
    }

    public static void main(String[] args) {
        final CyclicBarrier cb = new CyclicBarrier(3,
                () -> System.out.println("Clean!"));
        ExecutorService service = Executors.newScheduledThreadPool(2);

        IntStream.iterate(1, i -> 1)
                .limit(12)
                .forEach(i -> service.submit(
                        () -> wait(cb)
                ));
        service.shutdown();
    }
}
