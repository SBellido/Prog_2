package tp8_ElectoralSystem;

import java.util.ArrayList;
import java.util.List;

public class VotingTable extends VotingPlace {
	private List<Integer> voters;
	private List<Vote> votes;
	
	public VotingTable() {
		this.voters = new ArrayList<>();
		this.votes = new ArrayList<>();	
	}

	@Override
	public int countVotes(Candidate candidate) {
		int total = 0;
		for (Vote vote : this.votes) {
			if (vote.getCandidate().equals(candidate))
				total++;
		}
		return total;
	}
	
	@Override
	public int countVotes() {
		return this.votes.size();
	}
	
	@Override
	public int countVotesNull() {
		int totalNull = 0;
		for (Vote vote : this.votes) {
			if (vote.getCandidate().getName() == null) 
				totalNull++;
		}
		return totalNull;
	}

	@Override
	public int countVotesEspecificTime(Criteria criteria) {
		int totaVotesFound = 0;
		for (Vote vote : this.votes) {
			if (criteria.meetsCondition(vote)) {
				totaVotesFound++;
			}
		}
		return totaVotesFound;
	}	

	public void addDni(int newDni) {
		for (Integer dni : this.voters) {
			if (dni == newDni)
				return;
		}
		this.voters.add(newDni);
	}
	
	public void registerVote(Voter voter) {
		if (this.voters.contains(voter.getNumberDni()) && !voter.isAlreadyVoted()) {
			Vote newVote = voter.getVote();
			this.votes.add(newVote);			
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			VotingTable aux = (VotingTable) obj;
			return (this.voters.containsAll(aux.voters) &&
					this.votes.containsAll(aux.votes));
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "VotingTable [voters=" + voters + ", votes=" + votes + "]";
	}
	

}
