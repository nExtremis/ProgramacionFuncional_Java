package clase11;

import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test11{
    public static  void main(String[] args) {

        int skipValue = 6;

        final List<Venta> ventasPorMes = Arrays.stream(Month.values())
                .map(month -> new Venta(month, generarDoubleAleatorio()))
                .toList();
        List<String> nombres = List.of("fernando", "gonzalo", "ana", "jorge","anastasia","ariadna","anabel");
        System.out.println(ventasPorMes);
        //trimestral, Q1,Q2,Q3
        List<Venta> segundaMitadDeAnio = ventasPorMes.stream()
                .skip(skipValue)
                .toList();
        System.out.println(segundaMitadDeAnio);

    }

    public static double generarDoubleAleatorio(){
        return new Random().nextDouble(2000);
    }
}