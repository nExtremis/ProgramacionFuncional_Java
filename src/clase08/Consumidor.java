package clase08;

import java.util.function.Consumer;

public class Consumidor implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
