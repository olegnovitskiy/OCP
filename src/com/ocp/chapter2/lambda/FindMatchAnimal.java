package com.ocp.chapter2.lambda;

import java.util.function.Predicate;

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHope() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return species;
    }
}

interface CheckTrait {
    public boolean test(Animal animal);
}

public class FindMatchAnimal {
//    private static void print(Animal animal, CheckTrait trait) {
    private static void print(Animal animal, Predicate<Animal> trait) {
        if (trait.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        print(new Animal("fish", false, false), a -> a.canHope());
        print(new Animal("roo", false, true), Animal::canSwim);
    }
}