package clase20201105.expresiones;

public class Resta extends ExpresionBinaria{

    public Resta(Expresion expDer, Expresion expIzq) {
        super("-", expIzq, expDer);
    }

    @Override
    public double getValor() {
        return expIzq.getValor() - expDer.getValor();
    }

    @Override
    public Expresion getOpuesta(){
        return new Suma(expIzq.getOpuesta(), expDer.getOpuesta());
    }
}
