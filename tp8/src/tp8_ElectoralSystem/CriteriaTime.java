package tp8_ElectoralSystem;

import java.time.LocalDateTime;

public class CriteriaTime extends Criteria {
	private LocalDateTime time1, time2;

	public CriteriaTime(LocalDateTime time1, LocalDateTime time2) { }

	@Override
	public boolean meetsCondition(Vote vote) {		
		return (vote.getDate().isAfter(time1) && 
				vote.getDate().isBefore(time2));
	}

}
