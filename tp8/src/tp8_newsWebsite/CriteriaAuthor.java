package tp8_newsWebsite;

public class CriteriaAuthor extends Criteria {
	private String author;
	
	public CriteriaAuthor(String author) {
		this.author = author;
	}

	@Override
	public boolean meetsCondition(News news) {
		return news.getAuthor().equals(this.author);
	}

}
