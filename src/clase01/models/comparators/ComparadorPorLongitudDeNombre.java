package clase01.models.comparators;

import clase01.models.Persona;

import java.util.Comparator;

public class ComparadorPorLongitudDeNombre implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        int primero = o1.getNombre().length();
        int segundo = o2.getNombre().length();

        return Integer.compare(primero, segundo);
    }
}


