package tp7_vocabulary;

import java.util.Comparator;

public class AlphaveticComparator implements Comparator<Word>{

	public AlphaveticComparator() {
		
	}

	@Override
	public int compare(Word word1, Word word2) {
		return word1.getName().compareTo(word2.getName()); 
	}

}
