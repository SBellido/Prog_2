package clase20201105.expresiones.comparadores;

import clase20201105.expresiones.Expresion;

import java.util.Comparator;

public class ComparadorCantidadOperadores implements Comparator<Expresion> {

    @Override
    public int compare(Expresion e1, Expresion e2) {
        return e1.getOperadores().size()-
                e2.getOperadores().size();
    }
}
