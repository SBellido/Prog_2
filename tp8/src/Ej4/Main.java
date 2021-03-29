package Ej4;

import Ej4.Criteria.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CompositeNews Generales= new CompositeNews("Generales","test","image.jpg");
        CompositeNews Espectaculos= new CompositeNews("Espectaculos","test","image.jpg");
        CompositeNews Deportes= new CompositeNews("Deportes","test","image.jpg");
        CompositeNews Divorcios= new CompositeNews("Divorcios","test","image.jpg");
        CompositeNews Futbol= new CompositeNews("Futbol","test","image.jpg");

        News Noticia1 = new News("Cine","asda","asdasd","Cualquiera","Link 1");
        News Noticia2 = new News("Divorcio","asda","asdasd","Cualquiera","Link 2");
        News Noticia3 = new News("Divorcio","asda","asdasd","Cualquiera","Link 3");
        News Noticia4 = new News("Futbol","asda","asdasd","Cualquiera","Link 4");
        News Noticia5 = new News("Futbol","asda","asdasd","Cualiera","Link 5");
        News Noticia6 = new News("General","asda","asdasd","Cualquiera","Link 6");

        Generales.addElement(Espectaculos);
        Generales.addElement(Deportes);
        Generales.addElement(Noticia6);
        Espectaculos.addElement(Noticia1);
        Espectaculos.addElement(Divorcios);
        Divorcios.addElement(Noticia2);
        Divorcios.addElement(Noticia3);
        Deportes.addElement(Futbol);
        Deportes.addElement(Noticia5);
        Futbol.addElement(Noticia4);

        Noticia4.addKeyword("Partido");
        Noticia6.addKeyword("Partido");


      /* ArrayList<String> list=Generales.getPath("");
        for (String s : list){
            System.out.println(s);
        }*/

        KeywordCriteria c2 = new KeywordCriteria("Partido");
        KeywordCriteria c3 = new KeywordCriteria("Goleada");
        AndCriteria c1= new AndCriteria(c2,c3);
        AuthorCriteria c4 = new AuthorCriteria("Cualquiera");
        TextCriteria c5 = new TextCriteria(5);
        TitleCriteria c6= new TitleCriteria("Futbol");
        QuantityNewsCriteria c7= new QuantityNewsCriteria();

       /* ArrayList<ElementNews> listByCriteria= Generales.getNewsBy(c6);
        for(ElementNews elem: listByCriteria){
            System.out.println(elem);
        }*/

       ElementNews copy = Generales.getCopy(c2);

        ArrayList<String> list=copy.getPath("");
        for (String s: list){
            System.out.println(s);
        }


    }
}
