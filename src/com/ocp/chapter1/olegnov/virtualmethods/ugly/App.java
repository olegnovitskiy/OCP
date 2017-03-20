package com.ocp.chapter1.olegnov.virtualmethods.ugly;

public class App {
    private static void feedAnimal(Animal animal) {
        if (animal instanceof Cow) {
            ((Cow) animal).addHay();
        }
        else if (animal instanceof Bird) {
            ((Bird) animal).addSeed();
        }
        else if (animal instanceof Lion) {
            ((Lion) animal).addMeat();
        }
    }

    public static void main(String[] args) {
        feedAnimal(new Animal());
    }
}

class Animal {}

class Cow extends Animal {
    void addHay() {
        System.out.println("Add a hay to cow");
    }
}

class Bird extends Animal {
    void addSeed() {
        System.out.println("Add a seed to bird");
    }
}

class Lion extends Animal {
    void addMeat() {
        System.out.println("Add a meat to lion");
    }
}