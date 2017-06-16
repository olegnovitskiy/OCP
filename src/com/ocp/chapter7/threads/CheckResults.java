package com.ocp.chapter7.threads;

/**
 * Created by olegnovitskiy on 6/14/17.
 */
public class CheckResults {
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
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
