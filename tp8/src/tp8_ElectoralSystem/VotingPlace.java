package tp8_ElectoralSystem;


public abstract class VotingPlace {
	
	public VotingPlace() { }
	
	public abstract int countVotes();
	public abstract int countVotes(Candidate candidate);
	public abstract int	countVotesNull();
	public abstract int countVotesEspecificTime(Criteria criteria);
	
	public double getPercentageOfVotes(Candidate candidate) {
		int totalVotesCandidate = countVotes(candidate);
		int totalVotes = countVotes();
		return ((double)totalVotesCandidate / (double)totalVotes) * 100;
	}
	
	public double getPercentageOfVotesNull() {
		int totalVotesNull = countVotesNull();
		int totalVotes = countVotes();
		return ((double)totalVotesNull / (double)totalVotes) * 100;
	}
	
	public double getPercentageOfVotesEspecificTime(Criteria criteria) {
		int totalVotesInThisTime = countVotesEspecificTime(criteria);
		int totalVotes = countVotes();
		return ((double)totalVotesInThisTime / (double)totalVotes) * 100;
	}
	

	

}
