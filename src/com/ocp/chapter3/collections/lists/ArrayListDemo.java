package com.ocp.chapter3.collections.lists;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        String[] array = { "Dog", "Cat"};
        List<String> animals = Arrays.asList(array);    // returns fixed size list!

        animals.set(1, "Tiger");
        System.out.println(Arrays.toString(array));
        System.out.println(animals);

        array[0] = "Wolf";
        System.out.println(Arrays.toString(array));
        System.out.println(animals);

        animals.add("Ox");  // Unsupported operation exception
    }
}
