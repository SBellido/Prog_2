package clase20201105.expresiones;

public class Division extends ExpresionBinaria{
    public Division(Expresion expDer, Expresion expIzq) {

        super("/", expIzq, expDer);
    }

    @Override
    public double getValor() {
        double resultado = expDer.getValor();
        if (resultado == 0)
            return Expresion.getNumeroMagico();
        else
            return expIzq.getValor() / resultado;
    }

    @Override
    public Expresion getOpuesta(){
        return new Multiplicacion(expIzq.getOpuesta(), expDer.getOpuesta());
    }
}
