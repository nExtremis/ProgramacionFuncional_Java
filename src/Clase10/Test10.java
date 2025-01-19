package Clase10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test10 {
    public static void main(String[] args) {

        List<String> nombres = List.of("fernando", "gonzalo", "ana", "jorge", "anastasia", "ariadna", "anabel");

        List<String> list = nombres.stream()
                .filter(new Predicator())
                .filter(s -> s.endsWith("a"))
                .filter(s -> s.contains("t"))
                .map(String::toUpperCase)
                .toList();

        System.out.println(list);
//
//        System.out.println(list);
    }
}