package tp8_WorkBreakdownStructure;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleTask extends Task {
	private State state;
	private LocalDate estimatedInit;
	private LocalDate realInit;
	private LocalDate estimatedEnd;
	private LocalDate realEnd;
	private List<Resourse> resourses;
	
	enum State {
		COMPLETA,
		PROCESAMIENTO,
		ESPERA	
	}	
	
	public SimpleTask() {}
	public SimpleTask(String name, LocalDate estimatedInit, LocalDate estimatedEnd) {
		super(name);
		this.setState(State.ESPERA);
		this.estimatedInit = estimatedInit;
		this.setEstimatedEnd(estimatedEnd);
		this.resourses = new ArrayList<>();
	}
	

//	OBTENER LISTA DE FECHAS ORDENADAS
	public List<LocalDate> getOrderDates() {
		List<LocalDate> orderList = new ArrayList<>();
		orderList.add(this.getEstimatedEnd());
		orderList.add(this.getEstimatedInit());
		
		if (this.getRealEnd() != null)
			orderList.add(this.getRealEnd());		
		if (this.getRealInit() != null) 
			orderList.add(this.getRealInit());	
		
		Collections.sort(orderList);
		return orderList;
	}

//	1. Devolver la lista de tareas que están atrasadas (fecha de finalización estimada 
//	es posterior a la fecha actual y su estado es “en espera”).
	@Override
	public List<Task> delayedTasks() {
		List<Task> delayedTasks = new ArrayList<>();
		if (this.getEstimatedEnd().isAfter(LocalDate.now()) && 
				this.getState().equals(State.ESPERA)) 
			delayedTasks.add(this);
		return delayedTasks;
	}

//	2. Dado un recurso, devolver la lista de tareas que lo utilizan.
	@Override
	public List<Task> getTasks(Resourse searchResourse) {
		List<Task> tasksFound = new ArrayList<>();
		if (this.containsResourse(searchResourse))
			tasksFound.add(this);
		return tasksFound;
	}	
	
//	3. Dada una tarea, devolver los recursos involucrados (en caso de no ser una tarea
//	terminal es la suma de todos los recursos de las tareas que lo componen, SINREPETIDOS ).	
	@Override
	public List<Resourse> getResourses() {
		List<Resourse> copy = new ArrayList<>();	
			copy.addAll(this.resourses);
		return copy;	
	}
	
//	4. Duración estimada de una tarea.
	public long getDurationTask() {
		long days = ChronoUnit.DAYS.between(
				this.getEstimatedInit(), this.getEstimatedEnd());
		return days;
	}	
	
//	5. Consultar si es posible asignar el recurso X a la tarea YY (tener en cuenta las fechas
//	de utilización de los recursos y si los mismos son o no exclusivos).
	public boolean canBeAssigned(Resourse resourse) {
		return resourse.canBeAssigned(this);
	}
	
//	A cada tarea terminal del Wbs se le pueden asignar recursos. 
	public void addResourse(Resourse resourse) {
		if (!this.containsResourse(resourse) && resourse.canBeAssigned(this))
			this.resourses.add(resourse);
			resourse.beAssignedToTask(this);
	}	

	public boolean containsResourse(Resourse resourse) {
		return this.resourses.contains(resourse);
	}	
	
//	FINALIZAR TAREA
	public void finishTask() {
		if (this.getRealInit() != null) {
			this.setRealEnd(LocalDate.now());
			this.setState(State.COMPLETA);
			this.unSetResourses();
		}
	}	
	private void unSetResourses() {
		for (Resourse resourse : this.resourses) {
			resourse.setDateEnd(this.getRealEnd());
			resourse.setDateInit(null);
			this.resourses.remove(resourse);
		}
	}
	
//	INICIAR TAREA
	public void initTask() {
		this.setRealInit(LocalDate.now());
		this.setState(State.PROCESAMIENTO);
		for (Resourse resourse : this.resourses)
			resourse.setDateInit(this.getRealInit());
	}	
	
	@Override
	public boolean equals(Object obj) {
		try {
			SimpleTask aux = (SimpleTask) obj;
			return (super.equals(aux) &&
					this.getState().equals(aux.getState()) &&
					this.getEstimatedEnd().equals(aux.getEstimatedEnd()) &&
					this.getEstimatedInit().equals(aux.getEstimatedInit()));
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public String toString() {
		return super.toString() + 
				"\n\tInformación de tarea terminal: " + 
				"\n\tFecha estimada inicio: " + this.getEstimatedInit() + 
				"\n\tFecha real de inicio: " + this.getRealInit() + 
				"\n\tFecha estimada de finalización: " + this.getEstimatedEnd() + 
				"\nEstado de la Tarea:" + this.getState() + 
				"\n\tFecha real de finalización: " + this.getRealEnd();
			
	}

//	GETTERS & SETTERS
	public void setEstimatdInit(LocalDate estimatedInit) {
		int result = estimatedInit.compareTo(this.getEstimatedEnd());
		if (result < 0) 
			this.estimatedInit = estimatedInit;
		else 
			this.estimatedInit = this.getEstimatedEnd();
	}
	public void setEstimatedEnd(LocalDate estimatedEnd) {
		int result = estimatedEnd.compareTo(this.getEstimatedInit());
		if (result > 0) 
			this.estimatedEnd = estimatedEnd;
		else 
			this.estimatedEnd = this.getEstimatedInit();
	}	
	public LocalDate getEstimatedInit() {
		return estimatedInit;
	}
	public LocalDate getRealInit() {
		return realInit;
	}
	public void setRealInit(LocalDate realInit) {
		this.realInit = realInit;
	}
	public LocalDate getEstimatedEnd() {
		return estimatedEnd;
	}	
	public LocalDate getRealEnd() {
		return realEnd;
	}
	public void setRealEnd(LocalDate realEnd) {
		this.realEnd = realEnd;
	}	
	public void setState(State state) {
		this.state = state;				
	}	
	public State getState() {
		return this.state;
	}

	
}
