package clase20201105.expresiones;

import java.util.ArrayList;

public abstract class ExpresionBinaria extends Expresion{

    protected Expresion expDer;
    protected Expresion expIzq;
    private String operador;

    public ExpresionBinaria(String op, Expresion expDer, Expresion expIzq) {
        this.expDer = expDer;
        this.expIzq = expIzq;
        this.operador = op;
    }

    @Override
    public ArrayList<Double> getNumeros() {
        ArrayList<Double> retorno = new ArrayList<>();
        retorno.addAll(expIzq.getNumeros());
        retorno.addAll(expDer.getNumeros());
        return retorno;
    }

    @Override
    public ArrayList<String> getOperadores() {
        ArrayList<String> retorno = new ArrayList<>();

        retorno.addAll(expIzq.getOperadores());
        retorno.add(this.operador);
        retorno.addAll((expDer.getOperadores()));

        return retorno;
    }

    @Override
    public String toString() {
        return "(" + expIzq.toString() + this.operador +
                expDer.toString() + ")";
    }


}
