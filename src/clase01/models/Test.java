package clase01.models;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static  void main(String[] args) {

        List<Persona> listaPersonas = generarPersonas(100);
        System.out.println("Antes de ordenar");
        System.out.println(listaPersonas);
        listaPersonas.sort(  (o1,o2) -> Integer.compare(o1.getNombre().length(), o2.getNombre().length()) );
        System.out.println("despues de ordenar");
        System.out.println(listaPersonas);

    }
    private static List<Persona> generarPersonas(int cantidad){
        List<Persona>  personas =  new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            String nombre = FakerUtils.generarNombre();
            String apellido = FakerUtils.generarApellido();
            personas.add(new Persona(nombre,apellido));

        }
        return personas;
    }
}