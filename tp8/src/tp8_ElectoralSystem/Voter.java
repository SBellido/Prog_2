package tp8_ElectoralSystem;

public class Voter {
	private int dni;
	private int numberDni;
	private Candidate preferredCandidate;
	private boolean alreadyVoted;
	
	public Voter(Candidate preferredCandidate) {
		this.numberDni = dni++;
		this.alreadyVoted = false;
		this.preferredCandidate = new Candidate();
	}
	
	public Vote getVote() {
		Vote vote = new Vote(this.preferredCandidate);
		this.alreadyVoted = true;
		return vote;
	}
	
@Override
	public String toString() {
		return "Voter [dni=" + dni + ", numberDni=" + numberDni + ", preferredCandidate=" + preferredCandidate
				+ ", alreadyVoted=" + alreadyVoted + "]";
	}

	//	GETTERS & SETTERS
	public int getNumberDni() {
		return numberDni;
	}
	public boolean isAlreadyVoted() {
		return alreadyVoted;
	}
	public void setAlreadyVoted(boolean alreadyVoted) {
		this.alreadyVoted = alreadyVoted;
	}
	public void setCandidate(Candidate candidate) {
		this.preferredCandidate = candidate;
	}
	
}
