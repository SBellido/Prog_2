package clase20201105;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {
        Map<String, Integer> palabras = new HashMap<>();
        String texto = "este es un ejemplo de uso de mapas ejemplo ejemplo";
        String palabrasArray[] = texto.split(" " );

        for (int i = 0; i < palabrasArray.length; i++) {
            String pal = palabrasArray[i];
            if (palabras.containsKey(pal)){
                int cantAnterior = palabras.get(pal).intValue();
                cantAnterior++;
                palabras.put(pal, cantAnterior);
            }
            else
                palabras.put(pal, 1);
        }

        for (String pal:palabras.keySet())
            System.out.println(pal+" aparece "+palabras.get(pal)+" veces");

    }

}
