package tp6_PersonaContract.copy;

public class Candidate {
	
	private String nameLastname;
	private int weeklyHours;
	private double netSalary;
	private String company;

	public Candidate() { }
	public Candidate(String nameLastname, int weeklyHours, double netSalary) {
		this.nameLastname = nameLastname; 
		this.weeklyHours = weeklyHours;
		this.netSalary = netSalary;
	}
	

		
	@Override
	public String toString() {
		return "\nCANDIDATO" + 
				"\nNombre: " + this.getNameLastname(); 
				
	}
	public boolean equals(Object obj) {
		try {
			Candidate aux = (Candidate) obj;
			return this.getNameLastname().equals(aux.getNameLastname()) &&
					this.getNetSalary() == aux.getNetSalary() &&
					this.getWeeklyHours() == aux.getWeeklyHours() &&
					this.getCompany().equals(aux.getCompany());
		} catch (Exception e) {
			return false;		
		}
	}

	
// GETTERS

	public String getNameLastname() {
		return nameLastname;
	}
	public int getWeeklyHours() {
		return weeklyHours;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
