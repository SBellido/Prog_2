package tp8_WorkBreakdownStructure;

public class ExclusiveResourse extends Resourse {
	private SimpleTask task;
	private boolean inUse;
	
	public ExclusiveResourse(String name) {
		super(name);
		this.inUse = false;	
	}


	@Override 
	public boolean canBeAssigned(SimpleTask task) {
		return this.task == null && !this.getInUse();
	}
	@Override
	public void beAssignedToTask(SimpleTask task) {
		this.setInUse(true);
		this.setTask(task);
	}
	@Override
	public boolean equals(Object obj) {
		try {
			ExclusiveResourse aux = (ExclusiveResourse) obj;
			return (super.equals(aux) && 
					this.getInUse() == aux.getInUse());
		} catch (Exception e) {
			return false;
		}
	}

// 	GETTERS & SETTERS
	public boolean getInUse() {
		return this.inUse;
	}
	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}
	public SimpleTask getTask() {
		return task;
	}
	public void setTask(SimpleTask task) {
		this.task = task;
	}
	

	
	

}
