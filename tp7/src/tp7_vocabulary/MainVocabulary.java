package tp7_vocabulary;

public class MainVocabulary {
/* 2 - Vocabulario
Se desean llevar las estad�sticas del vocabulario de un texto. El constructor de esta clase
recibe como par�metro un String y crea los objetos necesarios para saber qu� palabras
aparecen en el mismo y cu�ntas veces. Se debe permitir:
1. Conocer la cantidad de palabras diferentes que contiene el texto.
2. Retornar las N palabras m�s frecuentes.
3. Retornar las N palabras menos frecuentes.
4. Obtener la frecuencia de ocurrencia de una palabra.
5. Obtener un listado de palabras ordenadas ascendentemente.
6. Obtener un listado de palabras ordenadas por frecuencia.
 */
	public static void main(String[] args) {
		StastisticsOfAText stastisticsOfAText = new StastisticsOfAText(
				"Lo importante es entender que lo que estamos haciendo es importante");
		
//		System.out.println(stastisticsOfAText.getAlphaveticOrder());
//		System.out.println(stastisticsOfAText.getAlphaveticOrderFalling());
//		System.out.println(stastisticsOfAText.getNLessFrecuently(5));
//		System.out.println(stastisticsOfAText.getNMoreFrecuently(5));
//		System.out.println(stastisticsOfAText.getNumberOfDifferentWords());
		System.out.println(stastisticsOfAText.getFrequency("importante"));
	}

}
