package tp8_CostConrtol;

public abstract class Criteria {

	protected Criteria() { }

	protected abstract boolean meetsCondition(ElementExpense expense);
}
