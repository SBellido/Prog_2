package tp8_WorkBreakdownStructure;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompositeTask extends Task {
	private List<Task> tasks;
	
	public CompositeTask(String name) {
		super(name);
		this.tasks = new ArrayList<>();
	}

//	 La fecha de inicio de una tarea compuesta queda determinada por
//	 la fecha de inicio más temprana de sus subtareas. De manera análoga,
//	 la fecha de finalización de la tarea compuesta queda determinada por 
//	 la fecha de finalización más tardía de sus subtareas.		
	public LocalDate getInitDate() {
		List<LocalDate> orderDate = this.getOrderDates(); 	
		return orderDate.get(0);
	} 	
	public LocalDate getEndDate() {
		List<LocalDate> orderDate = this.getOrderDates(); 	
		return orderDate.get(orderDate.size()-1);
	}
	@Override
	public List<LocalDate> getOrderDates() {
		List<LocalDate> dates = new ArrayList<>();
		for (Task task : this.tasks) 
			dates.addAll(task.getOrderDates());
		Collections.sort(dates);
		return dates;
	}

//	1. Devolver la lista de tareas que están atrasadas (fecha de finalización estimada es
//	posterior a la fecha actual y su estado es “en espera”) .
	@Override
	public List<Task> delayedTasks() {
		List<Task> delayedTasks = new ArrayList<>();
		for (Task task : this.tasks) 
			delayedTasks.addAll(task.delayedTasks());
		return delayedTasks;
	}

	
//	2. Dado un recurso, devolver la lista de tareas que lo utilizan.
	@Override
	public List<Task> getTasks(Resourse resourse) {
		List<Task> tasksFound = new ArrayList<>();
		for (Task task : this.tasks) 
			tasksFound.addAll(task.getTasks(resourse));
		return tasksFound;
	}

	
//	3. Dada una tarea, devolver los recursos involucrados (en caso de no ser una tarea
//	terminal es la suma de todos los recursos de las tareas que lo componen, SINREPETIDOS ).	
	@Override
	public List<Resourse> getResourses() {
		List<Resourse> copy = new ArrayList<>();		
		for (Task task : this.tasks) {
			copy.removeAll(task.getResourses());
			copy.addAll(task.getResourses());
		}
		return copy;	
	}

// 4. Duración estimada de una tarea.
	@Override
	public long getDurationTask() {
		LocalDate init = getInitDate();
		LocalDate end = getEndDate();
		long totalDays = ChronoUnit.DAYS.between(init, end);
		return totalDays;
	}

	public void addTask(Task task) {
		if (!this.containstask(task))
			this.tasks.add(task);
	}
	
	public boolean containstask(Task task) {
		return this.tasks.contains(task);
	}

	@Override
	public boolean equals(Object obj) {
		try {
			CompositeTask aux = (CompositeTask) obj;
			return (super.equals(aux) && 
					this.tasks.containsAll(aux.tasks));
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public String toString() {
		return ("\n+" + super.toString() + 
				"\n\t" + this.tasks);
	}
	
}
