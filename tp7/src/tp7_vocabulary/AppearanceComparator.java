package tp7_vocabulary;

import java.util.Comparator;

public class AppearanceComparator implements Comparator<Word>{

	public AppearanceComparator() {
		
	}

	@Override
	public int compare(Word word1, Word word2) {
		return word1.getQuantity() - word2.getQuantity();
	}

}
