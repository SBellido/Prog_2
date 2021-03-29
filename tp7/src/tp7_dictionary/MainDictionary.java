package tp7_dictionary;
/*
1 - Diccionario
Un diccionario almacena una lista de palabras, ordenadas alfabéticamente. Cada palabra del
diccionario posee la función gramatical que cumple la palabra (sustantivo, adverbio, adjetivo,
etc), una o más definiciones, una lista de sinónimos y una lista de antónimos.
Implementar en Java una solución que permita:
● Agregar, modificar y eliminar palabras del diccionario.
● Dada una palabra, obtener la lista de sinónimos, ordenada ascendentemente
● Dada una palabra, obtener la lista de antónimos, ordenada ascendentemente
● Dada una palabra, obtener la lista de definiciones
● Dadas dos palabras, obtener la lista de palabras comprendidas entre ellas, en orden alfabético.
*/
public class MainDictionary {

	public static void main(String[] args) {
		
		Dictionary dictionary = new Dictionary();
		Word word1 = new Word("correr", "verbo");
		Word word2 = new Word("trotar", "verbo");
		Word word3 = new Word("galopar", "verbo");
		Word word4 = new Word("caminar", "verbo");
		Word word5 = new Word("pasear", "verbo");
		Word word6 = new Word("no moverse", "verbo");
		Word word7 = new Word("estar quieto", "verbo");
		
		
		dictionary.addWord(word1);
		dictionary.addWord(word2);
		dictionary.addWord(word3);
		dictionary.addWord(word4);
		dictionary.addWord(word5);
		
		word1.addSynonyms(word2);
		word1.addSynonyms(word3);
		word1.addAntonymous(word6);
		word1.addAntonymous(word7);
		word1.addDefinition("Moverse rapidamente");
		word1.addDefinition("Moverse rapidamente");
		word1.addDefinition("Moverse muy rapidamente");
		
		System.out.println(dictionary.getListSynonyms(word1));
		System.out.println(dictionary.getAntonyms(word1));
		System.out.println(dictionary.getDefinitions(word1));

	}

}
