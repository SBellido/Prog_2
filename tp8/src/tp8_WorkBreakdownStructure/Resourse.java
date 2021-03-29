package tp8_WorkBreakdownStructure;

import java.time.LocalDate;

public abstract class Resourse {
	private String name;
	private LocalDate dateInit;
	private LocalDate dateEnd;
	
	protected Resourse(String name) {
		this.name = name;
	}

//	5. Consultar si es posible asignar el recurso X a la tarea YY (tener en cuenta las fechas
//	de utilización de los recursos y si los mismos son o no exclusivos).
	public abstract boolean canBeAssigned(SimpleTask task);

//	A cada tarea terminal del Wbs se le pueden asignar recursos
	public abstract void beAssignedToTask(SimpleTask task);
	
	@Override
	public String toString() {
		return this.getName();
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Resourse aux = (Resourse) obj;
			return this.getName().equals(aux.getName());
		} catch (Exception e) {
			return false;
		}
	}
	
//	GETTERS & SETTERS
	public LocalDate getDateInit() {
		return dateInit;
	}
	public void setDateInit(LocalDate dateInit) {
		this.dateInit = dateInit;
	}
	public LocalDate getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(LocalDate dateEnd) {
		this.dateEnd = dateEnd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
