package clase07;



import java.util.List;

public class Test07{
    public static  void main(String[] args) {
        List<String> nombres = List.of("fernando", "gonzalo", "ana", "jorge");

//        for (int i = 0; i < nombres.size(); i++) {
//            System.out.println(nombres.get(i));
//        }

//        int counter = 0;
//
//        while (true){
//            System.out.println(nombres.get(counter));
//            if (counter == nombres.size() -1){
//                break;
//            }
//            counter++;
//        }

        //bucle for mejorado, bucle for-Each

//        for (String nombre : nombres){
//            System.out.println(nombre);
//        }

        ColeccionInventada<String> ci = new ColeccionInventada<>();
        ci.add("Gonzalo");
        ci.add("Carla");
        ci.add("Delfina");
        ci.add("Tiziana");
        for (String elemento: ci) {
            System.out.println(elemento);
        }

    }


}
