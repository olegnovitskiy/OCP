package com.ocp.chapter1.olegnov.virtualmethods.good;

public class App {
    private static void feedAnimal(Animal animal) {
        animal.feed();
    }

    public static void main(String[] args) {
        feedAnimal(new Lion());
    }
}

abstract class Animal {
    abstract void feed();
}

class Cow extends Animal {
    public void feed() {
        addHay();
    }

    private void addHay() {
        System.out.println("Add a hay to cow");
    }
}

class Bird extends Animal {
    public void feed() {
        addSeed();
    }

    private void addSeed() {
        System.out.println("Add seed to bird");
    }
}

class Lion extends Animal {
    public void feed() {
        addMeat();
    }

    private void addMeat() {
        Bird bird = new Bird();
        System.out.println("Add meat to lion");

    }
}

class Demo {
    int a;

    private int method1() {
        return 1;
    }

    static class MyStatic {
        private void method2() {
//            System.out.println(method1());
            new Demo().method1();
            System.out.println(new Demo().a);
        }
    }

    public static void main(String[] args) {
        MyStatic myStatic = new MyStatic();

    }
}