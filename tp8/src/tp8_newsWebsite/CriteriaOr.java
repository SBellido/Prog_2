package tp8_newsWebsite;

public class CriteriaOr extends Criteria {
	Criteria c1, c2;
	
	public CriteriaOr(Criteria c1, Criteria c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean meetsCondition(News news) {		
		return this.c1.meetsCondition(news) || this.c2.meetsCondition(news);
	}

}
