package tp8_newsWebsite;

public class CriteriaKeyWord extends Criteria {
	private String keyWord;
	
	public CriteriaKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	@Override
	public boolean meetsCondition(News news) {
		return news.containsKeyWord(keyWord);
	}

}
