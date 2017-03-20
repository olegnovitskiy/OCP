package com.ocp.chapter1.olegnov.virtualmethods.tricky;

public class PlayWithAnimal {
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.printName();

        animal.careFor();
    }
}

abstract class Animal {
    private String name = "???";

    void printName() {
        System.out.println(name);
    }

    void careFor() {
        play();
    }

    void play() {
        System.out.println("pet animal");
    }

}

class Lion extends Animal {
    private String name = "Lion";

    void play() {
        System.out.println("toss in meat");
    }
}