package MeteorologicalEstimate;

public class ConditionAnd extends Condition {
	Condition condition1;
	Condition condition2;
	
	public ConditionAnd(Condition condition1, Condition condition2) {
		this.condition1 = condition1;
		this.condition2 = condition2;
	}

	@Override
	public boolean willRain() {
		return this.condition1.willRain() && this.condition2.willRain();
		
	}

}
