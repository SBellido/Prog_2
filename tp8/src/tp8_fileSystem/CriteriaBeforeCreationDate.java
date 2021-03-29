package tp8_fileSystem;

import java.time.LocalDate;

public class CriteriaBeforeCreationDate extends Criteria{
	private LocalDate date;
	
	public CriteriaBeforeCreationDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public boolean meetsCondition(ElementFileSystem searched) {
		return searched.getCreationDate().isBefore(this.date);
	}

}
