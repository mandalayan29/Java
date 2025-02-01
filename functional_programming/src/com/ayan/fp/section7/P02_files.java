package com.ayan.fp.section7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class P02_files {

    public static void main(String[] args) throws IOException{
        Files.lines(Paths.get("file.txt"))
                .map(str-> str.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        Files.list(Paths.get("."))
                .forEach(System.out::println);
        System.out.println("--------------------------");
        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);
    }

}
