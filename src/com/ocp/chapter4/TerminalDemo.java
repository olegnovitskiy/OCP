package com.ocp.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by olegnovitskiy on 5/23/17.
 */
public class TerminalDemo {
    public static void main(String[] args) {
//        Stream<String> animals = Stream.of("monkey", "tiger", "bear");
        Stream<String> animals = Stream.empty();
        System.out.println(animals.count());

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent());

        Stream<String> infinite = Stream.generate(()->"chimp");
        infinite.findFirst().ifPresent(System.out::print);

        List<String> list = Arrays.asList("my", "name", "is");
        list.forEach(System.out::print);
        System.out.println();

        Stream<String> stream = Stream.of("a","b","c");
//        String word = stream.reduce("", (s, c) -> s + c);
        String word = stream.reduce("", String::concat);
        System.out.println(word);
        System.out.println();

        ForkJoinPool pool = ForkJoinPool.commonPool();
        System.out.println(pool.getParallelism());

        String sequence1 = "one, two, three";
        String sequence2 = "two, three, five";
        String sequence3 = "five, six";
        List<String> sentences = Arrays.asList(sequence1, sequence2, sequence3);
        Stream<String> strm = sentences.stream()
                .flatMap(str->Stream.of(str.split("[ ,.!\r\n]")))
                .filter(s->s.length()>0)
                .distinct();
        String result = strm.collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
