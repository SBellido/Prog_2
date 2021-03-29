package clase20201105.expresiones;

public class Multiplicacion extends ExpresionBinaria{
	
    public Multiplicacion(Expresion expDer, Expresion expIzq) {
        super("*", expIzq, expDer);
    }

    @Override
    public double getValor() {
        return expIzq.getValor() * expDer.getValor();
    }
    @Override
    public Expresion getOpuesta(){
        return new Division(expIzq.getOpuesta(), expDer.getOpuesta());
    }
}
