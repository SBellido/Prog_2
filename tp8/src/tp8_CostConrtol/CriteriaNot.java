package tp8_CostConrtol;

public class CriteriaNot extends Criteria {
	private CriteriaDinamic criteria;
	
	public CriteriaNot(CriteriaDinamic criteria) {
		this.criteria = criteria;
	}

	@Override
	public boolean meetsCondition(ElementExpense expense) {
		return !this.criteria.meetsCondition(expense);
	}

}
