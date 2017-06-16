package com.ocp.chapter7.threads;

// 1st approach - preferable
public class PrintData implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Print record: " + i);
        }
    }

    public static void main(String[] args) {
        (new Thread(new PrintData())).start();
    }
}

// 2nd approach
class ReadInventoryThread extends Thread {
    @Override
    public void run() {
        System.out.println("Print Zoo inventory");
    }

    public static void main(String[] args) {
        (new ReadInventoryThread()).start();
    }
}
