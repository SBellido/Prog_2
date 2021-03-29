package clase20201105.expresiones;

import java.util.ArrayList;

public class Numero extends Expresion{
    double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public ArrayList<Double> getNumeros() {
        ArrayList<Double> retorno = new ArrayList<>();
        retorno.add(this.getValor());
        return retorno;
    }

    @Override
    public ArrayList<String> getOperadores() {
        return new ArrayList<String>();
    }

    @Override
    public String toString() {
        return ""+this.valor;
    }

    @Override
    public Expresion getOpuesta() {
        return new Numero(this.getValor());
    }
}
