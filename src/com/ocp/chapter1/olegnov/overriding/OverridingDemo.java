package com.ocp.chapter1.olegnov.overriding;

public class OverridingDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.meo();

        Cat lynx = new Lynx();
        lynx.meo();

        Lynx realLynx = new Lynx();
        realLynx.meo();

        ((Lynx)lynx).fly();
    }
}

class Cat {
    public static void meo() {
        System.out.println("Cat meo");
    }

    public void woof() {
        System.out.println("Cat woof");
    }

    private void fly() {
        System.out.println("Cat can fly!");
    }
}

class Lynx extends Cat {

    public static void meo() {
        System.out.println("Lynx meo");
    }

//    public static void woof() {}  // Error!
//    private void woof() {}    // Error!

    public void fly() {
        System.out.println("Lynx can fly!");
    }
}