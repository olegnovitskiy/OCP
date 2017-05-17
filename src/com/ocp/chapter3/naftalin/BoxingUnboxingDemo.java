package com.ocp.chapter3.naftalin;

import java.util.Arrays;
import java.util.List;

public class BoxingUnboxingDemo {
    static int sum(List<Integer> ints) {
        int s = 0;
        for (int n: ints){
            s += n;
        }
        return s;
    }

    // 60 times slower than sum()
    static Integer sumInteger(List<Integer> ints) {
        Integer s = 0;
        for (Integer n : ints) {
            s += n; // problem with automatic boxing/unboxing
        }
        return s;
    }

    public static void main(String[] args) {
        List<Integer> bigs = Arrays.asList(100, 200, 300);
        assert sumInteger(bigs) == sum(bigs);
        assert sumInteger(bigs) == sumInteger(bigs);    // Not cached
        assert java.util.Objects.equals(sumInteger(bigs), sumInteger(bigs));

        List<Integer> smalls = Arrays.asList(1, 2, 3);
        assert sumInteger(smalls) == sum(smalls);
        assert sumInteger(smalls) == sumInteger(smalls);    // cached (Integer pool) -128 ... 127
    }
}
