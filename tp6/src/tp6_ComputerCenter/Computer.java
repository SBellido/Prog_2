package tp6_ComputerCenter;

public class Computer implements Comparable<Computer> {
	private static int id = 1;
	private int numberId;
	private boolean available;
	private int memory;
	private ProcessToRun processToRun;

	public Computer(int memory) {
		this.memory = memory;
		this.available = true;
		this.numberId = id++;
	}

// EJECUTAR PROCESO
	public void runProcess(ProcessToRun processToRun) {
			this.setProcessToRun(processToRun);
			this.setAvailable(false);
	}

// ¿PUEDE EJECUTARLO?
	public boolean canRun(ProcessToRun processToRun) {
		return (this.isAvailable() && 
				this.enoughMemory(processToRun) && 
				!processToRun.wasEjecuted());
	}

//	¿TIENE MEMORIA SUFICIENTE?
	public boolean enoughMemory(ProcessToRun processToRun) {
		return this.getMemory() >= processToRun.getMemoryRequirement();
	}

//	FINALIZAR EJECUCIÓN
	public void finalizeRun(ProcessToRun processToRun) {
		processToRun.setWasEjecuted(true);
		this.setProcessToRun(null);
		this.setAvailable(true);
	}

// 
	@Override
	public boolean equals(Object obj) {
		try {
			Computer aux = (Computer) obj;
			return this.getNumberId() == aux.getNumberId();
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "\n------------------------------------" + "\nCOMPUTADORA " + this.getNumberId() + "\nDisponible: "
				+ this.isAvailable() + "\nMemoria: " + this.getMemory() + "\nEjecutando: " + this.getProcessToRun() + 
				"\n------------------------------------";
	}

	@Override
	public int compareTo(Computer computer) {
		int result = 0;
		int myMemory = this.getMemory();
		if (computer.getMemory() < myMemory)
			result = -1;
		else if (computer.getMemory() > myMemory) {
			result = 1;
		}
		return result;
	}

//  GETTERS & SETTERS
	public boolean getAvailable() {
		return this.available == true ;
	}
	
	public boolean isAvailable() {
		return (this.available == true && this.getProcessToRun() == null);
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getNumberId() {
		return numberId;
	}

	public ProcessToRun getProcessToRun() {
		return processToRun;
	}

	public void setProcessToRun(ProcessToRun processToRun) {
		this.processToRun = processToRun;
	}

}
