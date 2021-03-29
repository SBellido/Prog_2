package clase20201105.expresiones;

public class Suma extends ExpresionBinaria{

    public Suma(Expresion expDer, Expresion expIzq) {
        super("+", expIzq, expDer);
    }

    @Override
    public double getValor() {
        return expIzq.getValor() + expDer.getValor();
    }

    @Override
    public Expresion getOpuesta(){
        return new Resta(expIzq.getOpuesta(), expDer.getOpuesta());
    }

}
