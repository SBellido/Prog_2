package tp7_dictionary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Word implements Comparable<Word> {
	private String wordWrite;
	private String grammaticFunct;
	private List<String> definitions;
	private List<Word> synonyms;
	private List<Word> antonyms;
	
	public Word(String wordWrite, String grammaticFunct) {
		this.wordWrite = wordWrite;
		this.grammaticFunct = grammaticFunct;
		this.definitions = new ArrayList<>();
		this.synonyms = new ArrayList<>();
		this.antonyms = new ArrayList<>();
	}

//	CARGA SINÓNIMOS Y ANTÓNIMOS EN LISTA SI NO ESTÁN CARGADOS PREVIAMENTE
	public boolean containSynonymous(Word synonyms) {
		 return this.synonyms.contains(synonyms);
	}
	public boolean containAntonymous(Word antonyms) {
		return this.antonyms.contains(antonyms);
	}
	public boolean containDefinition(String definition) {
		return this.definitions.contains(definition);
	}
	public void addSynonyms(Word synonyms) {
		if (!containSynonymous(synonyms))
			this.synonyms.add(synonyms);		
	}
	public void addAntonymous(Word antonyms) {
		if (!containAntonymous(antonyms))
			this.antonyms.add(antonyms);		
	}
	
	public void addDefinition(String definition) {
		if (!containDefinition(definition))
			this.definitions.add(definition);		
	}
	@Override
	public int compareTo(Word word) {
		return this.wordWrite.compareTo(word.getWord());	
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Word aux = (Word) obj;
			return (this.getWord().equals(aux.getWord()));				
		} catch (Exception e) {
			return false;
		}
	}


	@Override
	public String toString() {
		return wordWrite;
	}

	public String getWord() {
		return wordWrite;
	}

	public void setWord(String wordWrite) {
		this.wordWrite = wordWrite;
	}

	public String getGrammaticFunct() {
		return grammaticFunct;
	}

	public void setGrammaticFunct(String grammaticFunct) {
		this.grammaticFunct = grammaticFunct;
	}

	public List<String> getDefinitions() {
		return new ArrayList<>(this.definitions);
	}

	public List<Word> getSynonyms() {
		List<Word> copy = new ArrayList<>(this.synonyms);
		Collections.sort(copy);
		return copy;
	}

	public List<Word> getAntonyms() {
		List<Word> copy = new ArrayList<>(this.antonyms);
		Collections.sort(copy);
		return copy;
	}

	
}
