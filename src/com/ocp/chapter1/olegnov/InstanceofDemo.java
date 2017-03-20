package com.ocp.chapter1.olegnov;

public class InstanceofDemo {

    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof HeavyAnimal;
        boolean b2 = hippo instanceof Hippo;
        boolean b3 = hippo instanceof Elephant;
        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("b3: " + b3);

        boolean b4 = hippo instanceof Object;
        System.out.println("b4: " + b4);

        Hippo nullHippo = null;
        boolean b5 = nullHippo instanceof Object;
        System.out.println("b5: " + b5);

        Hippo anotherHippo = new Hippo();
//        boolean b5 = anotherHippo instanceof Elephant;    // Compile error!

        boolean b6 = hippo instanceof Mother;
        System.out.println("b6: " + b6);
    }
}

class HeavyAnimal {}

class Hippo extends HeavyAnimal {}

class Elephant extends HeavyAnimal {}

interface Mother {}

class MotherHippo extends Hippo implements Mother {}
