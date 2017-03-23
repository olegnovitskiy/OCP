package com.ocp.chapter1.olegnov.anonimous;

public class AnonInnerParam {
    private interface SaleTodayOnly {
       int dollarsOff();
    }

    int pay() {
        return admission(5, new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        });
    }

    int admission(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {
        int a = 10;
        assert a != 10;

        System.out.println(new AnonInnerParam().pay());
    }
}
