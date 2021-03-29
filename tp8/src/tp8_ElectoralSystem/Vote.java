package tp8_ElectoralSystem;

import java.time.*;

public class Vote {
	private Candidate candidate;
	private LocalDateTime date;
	
	public Vote(Candidate candidate) {
		 LocalDate today = LocalDate.now();
	     LocalTime now = LocalTime.now();   
	     this.date = LocalDateTime.of(today, now);
	     this.candidate = candidate;
	}
	
	
//	GETTERS & SETTERS
	public Candidate getCandidate() {
		return candidate;
	}

	public LocalDateTime getDate() {
		return date;
	}


	@Override
	public String toString() {
		return "Vote [candidate=" + candidate + ", date=" + date + "]";
	}

	
}
