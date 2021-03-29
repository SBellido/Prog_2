package tp8_fileSystem;

public class CriteriaNot extends Criteria {
	Criteria criteria;
	
	public CriteriaNot() {
	}

	@Override
	public boolean meetsCondition(ElementFileSystem searched) {
		return !this.criteria.meetsCondition(searched);
	}

}
