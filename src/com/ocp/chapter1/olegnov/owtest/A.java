package com.ocp.chapter1.olegnov.owtest;

import java.io.Serializable;

public class A {
    private int i;

    public void test() {
        System.out.println("A.test()");
    }

    public void modifyOther(A a1) {
        a1.i = 10;
        System.out.println(a1.i);
    }

    public static void main(String[] args) {
        new A().modifyOther(new A());
    }
}

class B extends A {
    public void test() {
        System.out.println("B.test()");
    }
    public static void test(int a) {
        System.out.println("B.test(int a)");
    }

    public static void main(String[] args) {
        ((A)new B()).test();
        B.test(10);
    }
}

 enum Volume {
     LOW(0), MEDIUM(10), HIGH(20);
     private int value;

     Volume(int value) {
         this.value = value;
     }

     public int getValue() {
         return value;
     }

     public void setValue(int value) {
         this.value = value;
     }
 }

 enum NewEnum implements Runnable, Serializable {
     ;
     @Override
     public void run() {
         System.out.println("RUN!");
     }
 }

 class Demo {
     public static void main(String[] args) {
         // Volume volume = new Volume();
         System.out.println(Volume.HIGH.getValue());
         Volume.HIGH.setValue(0);
         System.out.println(Volume.HIGH.getValue());
         System.out.println();

         for (Volume v: Volume.values()
              ) {
             System.out.println(v.name() + ": " + v.getValue());
         }

         Volume v = Volume.values()[2];
         switch (v) {
             case LOW: System.out.println("LOW"); break;
             case HIGH:
                 System.out.println("HIGH");
                 break;
             case MEDIUM:
                 System.out.println("MEDIUM");
                 break;
         }
     }
 }

enum Question_5_1 {
    UP(1) {
        public void printValue() {
            System.out.println(value);
        }
    }, DOWN(0);
    int value;

    private Question_5_1(int value) {
        this.value = value;
    }
}

@FunctionalInterface
interface MyFunc {
    public abstract void run();
}