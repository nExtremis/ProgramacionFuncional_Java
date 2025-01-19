package Clase09;

import Clase09.Gato;
import Clase09.Perro;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test09{
    public static  void main(String[] args) {

        Function<Perro, Gato> mutacion = perro->new Gato(perro.getNombre());

        List<String> nombres = List.of("fernando", "gonzalo", "ana", "jorge");
        final List<String> nombresUpperCase = nombres.stream()
                .map(nombre->nombre.toUpperCase())
                .toList();
        System.out.println(nombresUpperCase);


        String[] arrayNombres = {"fernando", "gonzalo", "ana", "jorge"};

        final List<Perro> list = Arrays.stream(arrayNombres)
                .map(nombre ->new Perro(nombre))
                .toList();
        System.out.println(list);
    }


}

