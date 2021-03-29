package tp8_WorkBreakdownStructure;

import java.time.LocalDate;
import java.util.List;

public abstract class Task {
	private String name;
	
	protected Task() {}
	protected Task(String name) { 
		this.name = name;
	
	}

//	1. Devolver la lista de tareas que están atrasadas 
//	(fecha de finalización estimada es posterior a la fecha actual y su estado es “en espera”) .
	public abstract List<Task> delayedTasks();
	
//	2. Dado un recurso, devolver la lista de tareas que lo utilizan.
	public abstract List<Task> getTasks(Resourse resourse);
	
//	3. Dada una tarea, devolver los recursos involucrados (en caso de no ser una tarea
//	terminal es la suma de todos los recursos de las tareas que lo componen, SINREPETIDOS).
	public abstract List<Resourse> getResourses();

//	4. Duración estimada de una tarea.
	public abstract long getDurationTask();	
	public abstract List<LocalDate> getOrderDates(); 
		
	@Override
	public boolean equals(Object obj) {
		try {
			Task aux = (Task) obj;
			return this.getName().equals(aux.getName());
		} catch (Exception e) {
			return false;
		}
	}	
	
	

@Override
	public String toString() {
		return "\nNombre de la tarea: " + this.getName();
	}
	// GETTERS & SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
