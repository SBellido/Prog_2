package tp6_PersonaContract.copy;

import java.util.ArrayList;
import java.util.List;

public class Consultant {
	private String name;
	private List<Candidate> candidates;
	
	public Consultant(String name) {
		this.name = name;
		this.candidates = new ArrayList<>();
	}

	
// ¿YA EXISTE ESTE CANDIDATO?
	public boolean containsCandidate(Candidate candidate)  {
		return this.candidates.contains(candidate);
	}
	
		
// AGREGA CANDIDATOS
	public void addCandidate(Candidate candidate) {
		if (!containsCandidate(candidate)) {
			this.candidates.add(candidate);
		}
	}
	
	
// OBTENER LISTA DE POSIBLES CANDIDATOS
	public List<Candidate> getPossibleCandidates(Criteria criteria) {
		List<Candidate> suitableCandidates = new ArrayList<>();
		for (Candidate candidate : this.candidates) {
			if (criteria.acceptContract(candidate)) {
				suitableCandidates.add(candidate);
			}
		}
		return suitableCandidates;	
	}


	

	
	@Override
	public String toString() {
		return "\nCONSULTORA" + 
				"\nNombre: " + this.getName() + 
				"\nTodos los candidatos: " + this.getCandidates();
	}

	// GETTERS
	public List<Candidate> getCandidates() {
		return new ArrayList<>(this.candidates);
	}
	
	public String getName() {
		return this.name;
	}

}
