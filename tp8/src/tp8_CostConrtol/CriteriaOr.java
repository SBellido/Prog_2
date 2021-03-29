package tp8_CostConrtol;

public class CriteriaOr extends Criteria {
	private CriteriaDinamic c1, c2;
	
	public CriteriaOr(CriteriaDinamic c1, CriteriaDinamic c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean meetsCondition(ElementExpense expense) {
		return c1.meetsCondition(expense) || c2.meetsCondition(expense);
	}

}
