package clase20201105.expresiones.comparadores;

import clase20201105.expresiones.Expresion;

import java.util.Comparator;

public class ComparadorValorFinal implements Comparator<Expresion> {

    @Override
    public int compare(Expresion e1, Expresion e2) {
        double resultado = e1.getValor() - e2.getValor();
        if (resultado>0) return 1;
        else if (resultado<0) return -1;
        else return 0;
    }
}
