package tp8_fileSystem;

public class CriteriaOr extends Criteria {
	Criteria criteria1, criteria2;
	
	public CriteriaOr(Criteria criteria1, Criteria criteria2) {
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}

	@Override
	public boolean meetsCondition(ElementFileSystem searched) {
		return (criteria1.meetsCondition(searched) || 
				criteria2.meetsCondition(searched));
	}

}
