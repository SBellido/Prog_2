package tp8_ElectoralSystem;

import java.util.ArrayList;
import java.util.List;

public class VotingPlaceComposite extends VotingPlace {
	private List<VotingPlace> votingPlaces;
	
	public VotingPlaceComposite() {
		this.votingPlaces = new ArrayList<>();
	}

	public void addVotingPlace(VotingPlace votingPlace) {
		if (!containsVotingPlace(votingPlace)) {
			this.votingPlaces.add(votingPlace);
		}
	}
	
	public boolean containsVotingPlace(VotingPlace votingPlaces) {
		return this.votingPlaces.contains(votingPlaces);
	}	
	

	@Override
	public int countVotes() {
		int total = 0;
		for (VotingPlace votingPlace : this.votingPlaces) {
			total += votingPlace.countVotes();
		}
		return total;
	}
	
	@Override
	public int countVotes(Candidate candidate) {
		int total = 0;
		for (VotingPlace votingPlace : this.votingPlaces) {
			total += votingPlace.countVotes(candidate);
		}
		return total;
	}
	
	@Override
	public int countVotesNull() {
		int totalNull = 0;
		for (VotingPlace votingPlace : this.votingPlaces) {
			totalNull += votingPlace.countVotesNull();
		}
		return totalNull;
	}
	
	@Override
	public int countVotesEspecificTime(Criteria criteria) {
		int totalVotesFound = 0;
		for (VotingPlace votingPlace : this.votingPlaces) 
			totalVotesFound += votingPlace.countVotesEspecificTime(criteria);	
		return totalVotesFound;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			VotingPlaceComposite aux = (VotingPlaceComposite) obj; 
			return this.votingPlaces.containsAll(aux.votingPlaces);
		} catch (Exception e) {
			return false;
		}
	}



}
