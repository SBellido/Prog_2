package tp7_dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
	private List<Word> words; 

	public Dictionary() {
		this.words = new ArrayList<>();
	}
	
//	AGREGA PALABRA	
	public void addWord(Word word) {
		if (!this.containWord(word))
			this.words.add(word);
	}

//	EDITA PALABRA
	public void editWord(Word newWord) {
		int index =  this.words.indexOf(newWord); 
		if (index >= 0)
			this.words.set(index, newWord);			
	}

//	ELIMINA PALABRA
	public void deleteWord(Word searchedWord) {
		int index =  this.words.indexOf(searchedWord); 
		if (index >= 0)
			this.words.remove(index);
	}


//	BUSCA PALABRA, DEVUELVE PALABRA
	public Word findWord(Word searchedWord) {
		for (Word word : this.words) 
			if (word.equals(searchedWord)) 
				return word;			
		return null;
	}
	
//	OBTIENE LISTA ORDENADA DE SINÓNIMOS DE UNA PALABRA DADA
	public List<Word> getListSynonyms(Word searchedWord) {
		if (this.containWord(searchedWord))
			return this.findWord(searchedWord).getSynonyms();
		return null;			
	}

//	OBTIENE LISTA ORDENADA DE ANTÓNIMOS DE UNA PALABRA DADA	
	public List<Word> getAntonyms(Word searchedWord) {
		if (this.containWord(searchedWord))
			return this.findWord(searchedWord).getAntonyms();
		return null;	
	}
	
//	OBTIENE LISTA DE DEFINICIONES DE UNA PALABRA DADA	
	public List<String> getDefinitions(Word searchedWord) { 
		return searchedWord.getDefinitions();
	}
	
	public boolean containWord(Word word) {
		return this.words.contains(word);
	}

	@Override
	public String toString() {
		return "Dictionary [words=" + words + "]";
	}

	

}
