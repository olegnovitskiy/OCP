package com.ocp.chapter3.naftalin;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static <T> List<T> toList(T[] arr) {
        List<T> list = new ArrayList<T>();
        for (T element: arr) {
            list.add(element);
        }
        return list;
    }

    public static <T> List<T> toListVarArgs(T... arr) {
        List<T> list = new ArrayList<T>();
        for (T elem: arr) {
            list.add(elem);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> ints = Lists.toList(new Integer[] { 1, 2, 3});
        List<String> words = Lists.toList(new String[] {"Hellow", "World!"});

        List<Integer> ints1 = Lists.toListVarArgs(1,2,3);
        List<String> words1 = Lists.toListVarArgs("Hellow", "World!");

        List<Integer> ints2 = Lists.<Integer>toListVarArgs();
        List<Object> objs = Lists.<Object>toListVarArgs(1, "two");
    }
}
