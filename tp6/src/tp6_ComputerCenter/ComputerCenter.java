package tp6_ComputerCenter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerCenter {
	private List<Computer> computersAvailable;
	private List<Computer> computersProcessing;
	private List<ProcessToRun> processesToRun;
	
	public ComputerCenter() {
		this.computersAvailable = new ArrayList<>();
		this.computersProcessing = new ArrayList<>();
		this.processesToRun = new ArrayList<>();
		
	}

// AGREGA COMPUTADORA DISPONIBLE
	public void addComputer(Computer computer) {
		if (computer.isAvailable()) {
			this.computersAvailable.add(computer);
			this.orderComputers();
		} else { this.computersProcessing.add(computer); }
	}

// ORDENA COMPUTADORAS DISPONIBLES
	public void orderComputers() {
		Collections.sort(this.computersAvailable);
	}
	
// EJECUTA PROCESOS
	public void runProcess(ProcessToRun processToRun) {		
		for (Computer computer : this.computersAvailable) {
			if (computer.canRun(processToRun)) {
				this.addComputerInProcessing(computer);
				computer.runProcess(processToRun);
				this.computersAvailable.remove(computer);
				break;				
			}
			this.addOnWaitingList(processToRun);
		} 
	}
	
// CHEQUEA SI HAY COMPUTADORAS DISPONIBLES
	public boolean checkAvailable() {
		return this.computersAvailable.size() > 0;
	}


	public void finalizeRun(ProcessToRun processToRun) {
		for (Computer computer : this.computersProcessing) {
			if (computer.getProcessToRun().equals(processToRun)) {
				computer.finalizeRun(processToRun);
				this.computersAvailable.add(computer);
				this.computersProcessing.remove(computer);
				break;
			}
		}
	}
	
//	AJECUTA PROCESOS PENDIENTES
	public void runPending() {
		for (ProcessToRun processToRun : this.processesToRun) {
			this.runProcess(processToRun);
			this.processesToRun.remove(processToRun);
		}
	}
	
//	AGREGA COMPUTADORA PROCESANDO
	public void addComputerInProcessing(Computer computer) {
		if (!containsComputerInProcessing(computer)) {
			this.computersProcessing.add(computer);
		} 
	}
//	AGREGA COMPUTADORA A LISTADO DE LIBRES
	public void addComputerInAvailable(Computer computer) {
		if (!containsComputerAvailable(computer)) {
			this.computersAvailable.add(computer);
		} 
	}
	public void addOnWaitingList(ProcessToRun processToRun) {
		if (!processToRun.wasEjecuted() && this.checkAvailable()) 
			this.processesToRun.add(processToRun);
			Collections.sort(this.processesToRun);
	}

// ¿CONTIENE COMPUTADORA EN PROCESO?
	public boolean containsComputerInProcessing(Computer computer) {
		return this.computersProcessing.contains(computer);
	}
	
// ¿CONTIENE COMPUTADORA DISPONIBLE	
	public boolean containsComputerAvailable(Computer computer) {
		return this.computersAvailable.contains(computer);
	}
	
@Override
	public String toString() {
		return "\n------------------------------------" +
				"\nCENTRO DE COMPUTOS" + 
				"\nComputadoras procesando: " + this.getComputersProcessing() + 
				"\nComputadoras disponibles: " + this.getComputersAvailable() + 
				"\nProcesos en lista de ejecución: " + this.getProcessesToRun();
	}

	//GETTERS & SETTERS
	public List<Computer> getComputersAvailable() {
		return new ArrayList<>(this.computersAvailable);
	}

	public List<Computer> getComputersProcessing() {
		return new ArrayList<>(this.computersProcessing);
	}

	public List<ProcessToRun> getProcessesToRun() {
		return new ArrayList<>(this.processesToRun);
	}
	
}
