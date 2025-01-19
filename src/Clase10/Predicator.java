package Clase10;

import java.util.function.Predicate;

public class Predicator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return s.startsWith("a");
    }
}
