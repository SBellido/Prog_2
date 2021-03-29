package tp8_newsWebsite;

public class CriteriaTitle extends Criteria {
	private String title;
	
	public CriteriaTitle(String title) {
		this.title = title;
	}

	@Override
	public boolean meetsCondition(News news) {
		return this.title.equals(news.getTitle());
	}

}
