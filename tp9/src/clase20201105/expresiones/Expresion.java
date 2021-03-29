package clase20201105.expresiones;

import java.util.ArrayList;

public abstract class Expresion {
    private static double NUMERO_MAGICO = -23.0;

    public abstract double getValor();
    public abstract ArrayList<Double> getNumeros();
    public abstract ArrayList<String> getOperadores();
    public abstract Expresion getOpuesta();

    public static void setNumeroMagico(double numeroMagico) {
        NUMERO_MAGICO = numeroMagico;
    }

    public static double getNumeroMagico() {
        return NUMERO_MAGICO;
    }
}
