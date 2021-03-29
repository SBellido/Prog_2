package tp8_fileSystem;

import java.time.LocalDate;

public class CriteriaAfterModificationDate extends Criteria {
	private LocalDate date;
	
	public CriteriaAfterModificationDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public boolean meetsCondition(ElementFileSystem searched) {
		return searched.getModificationDate().isAfter(this.date);
	}

}
