package clase20201105.expresiones;

import clase20201105.expresiones.comparadores.ComparadorCantidadOperadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sistema {
    private ArrayList<Expresion> predefinidas;

    public Sistema(){
        predefinidas = new ArrayList<>();
    }

    public void addExpresion(Expresion e){
        predefinidas.add(e);
    }

    public ArrayList<Expresion> getLista(Comparator<Expresion> criterioOrden){
        ArrayList<Expresion> copia = new ArrayList<>();
        copia.addAll(predefinidas);
        Collections.sort(copia, criterioOrden);
        return copia;
    }


    public static void main(String[] args) {
        ExpresionBinaria dosmastres = new Suma(
                new Numero(2), new Numero(3)
        );
        ExpresionBinaria dosmastresporcinco = new Multiplicacion(
                dosmastres, new Numero(5)
        );


        Numero cinco = new Numero(5);
        Numero tres = new Numero(3);
        Numero uno = new Numero (1);
        Suma cincomascinco = new Suma(cinco, cinco);
        Resta tresmenosuno = new Resta(tres, uno);
        Multiplicacion toda = new Multiplicacion(cincomascinco, tresmenosuno);

        System.out.println(toda + " = " +toda.getValor());
        System.out.println(toda.getNumeros());
        System.out.println(toda.getOperadores());

        Resta tresmenostres = new Resta(tres, tres);
        Division error = new Division(cincomascinco, tresmenostres);
        System.out.println(error.getValor());

        Sistema ejemplo = new Sistema();
        ejemplo.addExpresion(dosmastresporcinco);
        ejemplo.addExpresion(toda);
        ejemplo.addExpresion(error);

        ArrayList<Expresion> expresiones = ejemplo.getLista(new ComparadorCantidadOperadores());
    }
}
