package tp8_CostConrtol;


public class CriteriaDinamic extends Criteria {
	private DinamicAttribute attribute;
	
	public CriteriaDinamic(DinamicAttribute attribute) {
		this.attribute = attribute;
	}

	@Override
	public boolean meetsCondition(ElementExpense expense) {	
		return expense.containsAttribute(this.attribute);
	}

}
