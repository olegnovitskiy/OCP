package com.ocp.chapter4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by olegnovitskiy on 5/25/17.
 */
public class ParallelStreamDemo {
    public static void main(String[] args) {
//        findAnyTest();
//        findFirstTest();

//        rangeTest();

        Stream<String> str = Stream.generate(() -> "Meow!");
        boolean match = str.allMatch(String::isEmpty);
        System.out.println(match);

        List<String> myList = sort(Arrays.asList("one", "two", "abc"));
        myList.forEach(System.out::println);

        Stream.generate(() -> "1")
//                .filter(x -> x.length() > 1)
                .limit(10)
//                .peek(System.out::println)
                .forEach(System.out::println);

        String t = "Hello";
        Supplier<String> x = () -> t.substring(1).toUpperCase();
        System.out.println(x.get());

    }

    private static List<String> sort(List<String> list) {
        return list.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

    private static void rangeTest() {
        double start = System.nanoTime();
        long c = IntStream.rangeClosed(0, 1_000_000_000)
                .sequential()
                .filter(i -> i % 2 == 0)
                .count();
        double duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Got " + c + " in " + duration + " milliseconds");
    }

    private static void findAnyTest() {
        long start = System.nanoTime();
        String any = Stream.of("a","b","c","d","e")
                .parallel().findAny().get();
        long duration = (System.nanoTime() - start) / 1000000;
        System.out.println(
                any + " found in " + duration + " milliseconds");
    }

    private static void findFirstTest() {
        long start = System.nanoTime();
        String first = Stream.of("a","b","c","d","e")
                .parallel().findFirst().get();
        long duration = (System.nanoTime() - start) / 1000000;
        System.out.println(
                first + " found in " + duration + " milliseconds");
    }
}
