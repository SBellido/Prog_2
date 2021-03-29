package tp8_ElectoralSystem;

public abstract class Criteria {

	public Criteria() { }

	public abstract boolean meetsCondition(Vote vote);
}
