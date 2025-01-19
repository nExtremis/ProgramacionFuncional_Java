package clase08;

import clase08.Consumidor;

import java.util.List;
import java.util.function.Consumer;

public class Test08{
    public static  void main(String[] args) {
        List<String> nombres = List.of("fernando", "gonzalo", "ana", "jorge");
        nombres.forEach( s-> System.out.println(s));

    }


}