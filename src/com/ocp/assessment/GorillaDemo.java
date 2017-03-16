package com.ocp.assessment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Collectors;

public class GorillaDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./gorilla/signed-words.txt");
        System.out.println(path.getFileName());

        /*
        Files.find(path.getParent(), 10,
                (Path p, BasicFileAttributes a) -> p.toString().endsWith(".txt") && Files.isDirectory(p))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Files.readAllLines(path)
                .flatMap(p -> Stream.of(p.split(" ")))
                .map(s -> s.toLowerCase())
                .forEach(System.out::println);
        */

        // Some fixes
        Files.find(path.getParent(), 10,
                (Path p, BasicFileAttributes a) -> p.toString().endsWith(".txt") && !Files.isDirectory(p))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Files.readAllLines(path)
                .forEach(System.out::println);
    }
}
