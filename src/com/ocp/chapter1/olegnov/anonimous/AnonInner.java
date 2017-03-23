package com.ocp.chapter1.olegnov.anonimous;

public class AnonInner {
//    abstract class SaleTodayOnly {
//        abstract int dollarsOff();
//    }

    interface SaleTodayOnly {
        int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            public int dollarsOff() {
                return 1;
            }
        };

        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        int admission = new AnonInner().admission(10);
        System.out.println(admission);
    }
}

