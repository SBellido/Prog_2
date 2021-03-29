package tp8_fileSystem;

public class CriteriaName extends Criteria {
	private String name;
	
	public CriteriaName(String name) {
		this.name = name;
	}

	@Override
	public boolean meetsCondition(ElementFileSystem searched) {		
		return searched.getName().equals(this.name);
	}

}
