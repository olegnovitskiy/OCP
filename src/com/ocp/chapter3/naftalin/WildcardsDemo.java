package com.ocp.chapter3.naftalin;

import java.util.*;

public class WildcardsDemo {

    // Produce data
    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num: nums) {
            s += num.doubleValue();
        }
        return s;
    }

    // Consume data
    public static void count(Collection<? super Integer> ints, int n) {
        for (int i = 0; i < n; i++) {
            ints.add(i);
        }
    }

    // Produce & Consume
    // Try to change Number: ? extends Number or ? super Number
    public static double sumCount(Collection<Number> nums, int n) {
        count(nums, n);
        return sum(nums);
    }

    public static void main(String[] args) {
        List<Object> objs = Arrays.asList(2, 3.14, "hello");
        List<Integer> ints = Arrays.asList(10, 20);
        Collections.copy(objs, ints);
        System.out.println(objs.toString());

        // Produce
        List<Integer> ints1 = Arrays.asList(1, 2, 3);
        assert sum(ints1) == 6.0;

        // Consume
        List<Number> nums = new ArrayList<>();
        count(nums, 5);
        nums.add(10.0);
        assert nums.toString().equals("[0, 1, 2, 3, 4, 10.0]");

        // Consume
        List<Object> objs1 = new ArrayList<>();
        count(objs1, 5);
        objs1.add("Hello");
        assert objs1.toString().equals("[0, 1, 2, 3, 4, Hello]");

        // Produce & Consume
        List<Number> nums2 = new ArrayList<>();
        double sum = sumCount(nums2, 5);
        assert sum == 10.0;

    }
}
