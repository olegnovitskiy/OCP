package com.ocp.assessment;

import java.util.Optional;
import java.util.stream.Stream;

public class MagicStream {
    private static void magic(Stream<Integer> s) {
        Optional o  = s.filter(x -> x < 5).limit(3).max((x, y) -> x - y);
        System.out.println(o.get());
    }

    public static void main(String[] args) {
        magic(Stream.of(5, 10));
    }
}
