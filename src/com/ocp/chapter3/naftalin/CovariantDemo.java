package com.ocp.chapter3.naftalin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CovariantDemo {

    public static void main(String[] args) {
        Integer[] ints = new Integer[] { 1, 2, 3 };
        Number[] nums = ints;
        nums[2] = 10.5;     // Runtime exception
        assert Arrays.toString(nums).equals("[1, 2, 3]");

        List<Integer> intList = Arrays.asList(1, 2, 3);
//        List<Number> numList = intList;   // compile error!
//        numList.set(2, 3.14);

        List<List<?>> myList = new ArrayList<List<?>>(); // ok
        List<?> list1 = new ArrayList<Object>(); // ok
//        List<?> list2 = new ArrayList<?>(); // compile-error
    }
}
