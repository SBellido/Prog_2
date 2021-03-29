package tp8_WorkBreakdownStructure;

public class SharedResourse extends Resourse {
	
	public SharedResourse(String name) {
		super(name);
	}

	@Override
	public boolean canBeAssigned(SimpleTask task) {
		if (this.getDateEnd() != null) {
			int result = this.getDateEnd().compareTo(task.getEstimatedInit());
			if (result < 0)
				return true;				
			else return false;			
		}
		return true;
	}
	
	@Override
	public void beAssignedToTask(SimpleTask task) {
		this.setDateEnd(task.getEstimatedEnd());
		this.setDateInit(task.getEstimatedInit());
	}

	


}
