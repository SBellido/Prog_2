package tp7_vocabulary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class StastisticsOfAText {
	private String text;
	private List<Word> textWords;
	
	public StastisticsOfAText(String text) {
		this.text = text;
		this.textWords = new ArrayList<>();
		
//		SEPARA EL TEXTO EN PALABRAS
		StringTokenizer tokenizer = new StringTokenizer(text);
		
//		MIENTRAS HAYA OTRA PALABRA, GUARDA LA SIGUIENTE
		while (tokenizer.hasMoreElements()) {
			String word = tokenizer.nextToken();
			this.addWord(word);
		}
	}

//	BUSCA PALABRA, SI EXISTE INCREMENTA SU FRECUENCIA, SINO LA AGREGA
	public void addWord(String searchedWord) {
		String wordLower = searchedWord.toLowerCase();
		for (Word word : this.textWords) {
			word.getName().toLowerCase();
			if (word.getName().equals(wordLower)) {
				word.increaseQuantity();
				return;
			}
		}
		Word newWord = new Word(wordLower);
		this.textWords.add(newWord);				
	}
	
//	RETORNA CANTDAD DE PALABRAS DIFERENTES
	public int getNumberOfDifferentWords() {
		return this.textWords.size();	
	}
	
//	OBTIENE LAS N MÁS FRECUENTES 
	public List<Word> getNMoreFrecuently(int N) {
//		ORDENA POR CANTIDAD DE APARICIONES
		Collections.sort(this.textWords, new AppearanceComparator());
		Collections.reverse(this.textWords);
		List<Word> topN = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			topN.add(this.textWords.get(i));
		}
		return topN;
	}
	
//	OBTIENE LAS N MENOS FRECUENTES 
	public List<Word> getNLessFrecuently(int N) {
//		ORDENA POR CANTIDAD DE APARICIONES
		Collections.sort(this.textWords, new AppearanceComparator());
		List<Word> topN = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			topN.add(this.textWords.get(i));
		}
		return topN;
	}
	
//	OBTIENE PALABRAS EN ORDEN ALFABÉTICO ASCENDENTE
	public List<Word> getAlphaveticOrder() {
//		ORDENA POR ALFAVETO
		Collections.sort(this.textWords, new AlphaveticComparator());	
		return this.textWords;
	}
	
//	OBTIENE PALABRAS EN ORDEN ALFABÉTICO DESCENDENTE
	public List<Word> getAlphaveticOrderFalling() {
//		ORDENA POR ALFAVETO
		Collections.sort(this.textWords, new AlphaveticComparator());
		Collections.reverse(this.textWords);
		return this.textWords;
	}

//	OBTIENE PALABRAS EN ORDEN DE FRECUENCIA
	public List<Word> getOrderFrequency() {
		Collections.sort(this.textWords, new AppearanceComparator());
		return this.textWords;
	}
	
//	OBTIENE FRECUENCIA DE UNA PALABRA
	public int getFrequency(String searchedWord) {
		for (Word word : this.textWords)
			if (word.getName().equals(searchedWord))
				return word.getQuantity();
			return 0;
	}
	
	@Override
	public String toString() {
		return "TEXTO" + this.getText() + 
				"\nLista de palabras: " + this.getTextWords();
	}

	public List<Word> getTextWords() {
		return new ArrayList<>(this.textWords);
	}
	
	public String getText() {
		return this.text;
	}
}
