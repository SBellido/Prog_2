package tp8_ElectoralSystem;

public class Candidate implements Comparable<Candidate> {
	private String name;
	private String politicParty;
	private String group;
	
	public Candidate() {}
	public Candidate(String name, String politicParty, String group) {
		this.name = name;
		this.politicParty = politicParty;
		this.group = group;		
	}

	@Override
	public int compareTo(Candidate candidate) {
		int result = this.getPoliticParty().compareTo(candidate.getPoliticParty());		
		if (result == 0) {
			result = this.getGroup().compareTo(candidate.getGroup());
			if (result == 0) {
				result = this.getName().compareTo(candidate.getName());
			}	
		}
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Candidate aux = (Candidate) obj;
			return (this.getPoliticParty().equals(aux.getPoliticParty()) &&
					this.getGroup().equals(aux.getGroup()));
		} catch (Exception e) {
			return false;
		}
	}

	
@Override
	public String toString() {
		return "\nPartido Político: " + this.getPoliticParty() + 
				"\nAgrupación: " + this.getGroup() +
				"\nNombre: " + this.getName();
	}
	//	GETTERS & SETTERS	
	public String getName() {
		return this.name;
	}
	public String getPoliticParty() {
		return politicParty;
	}
	public void setPoliticParty(String politicParty) {
		this.politicParty = politicParty;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}


}