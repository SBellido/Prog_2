package tp8_ElectoralSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectoralSystem {
	List<Candidate> candidates;
	List<VotingPlace> votingPlaces;
	
	public ElectoralSystem() {
		this.candidates = new ArrayList<>();
		this.votingPlaces = new ArrayList<>();
	}
	
	public List<Candidate> getCandidateOrder() {
		List<Candidate> copy = new ArrayList<>(this.candidates);
		Collections.sort(copy);
		return copy;
	}
	public void addCandidate(Candidate candidate) {
		if (!containsCandidate(candidate)) {
			this.candidates.add(candidate);
		}
	}
	public boolean containsCandidate(Candidate candidate) {
		return this.candidates.contains(candidate);
	}

}
