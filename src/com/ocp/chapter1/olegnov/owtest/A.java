package com.ocp.chapter1.olegnov.owtest;

public class A {
    private int i;

    public void modifyOther(A a1) {
        a1.i = 10;
        System.out.println(a1.i);
    }

    public static void main(String[] args) {
        new A().modifyOther(new A());
    }
}
