package com.ocp.chapter7.concurrent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by olegnovitskiy on 6/14/17.
 */
public class CopyOnWriteListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,3,4));
        for (Integer item: list) {
            System.out.println(item);
            list.add(9);
        }
        System.out.println();
        System.out.println(list);
    }
}
