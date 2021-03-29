package tp8_newsWebsite;


public class CriteriaMoreWordThan extends Criteria {
	private int quantity;
	
	public CriteriaMoreWordThan(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public boolean meetsCondition(News news) {
		int quantityWords = news.countWords(); 
		return quantityWords > this.quantity;
	}

}
