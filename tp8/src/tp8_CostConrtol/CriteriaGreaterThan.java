package tp8_CostConrtol;

public class CriteriaGreaterThan extends Criteria {
	private double value;
	
	public CriteriaGreaterThan(double value) {
		this.value = value;
	}

	@Override
	public boolean meetsCondition(ElementExpense expense) {
		return expense.getAmount() > this.value;
	}

}
