package tp6_PersonaContract.copy;

public class CriteriaSalary extends Criteria {
	private double netSalary;
	
	public CriteriaSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	@Override
	public boolean acceptContract(Candidate candidate) {
		return this.getNetSalary() >= candidate.getNetSalary();
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setSalary(double netSalary) {
		this.netSalary = netSalary;
	}

}
