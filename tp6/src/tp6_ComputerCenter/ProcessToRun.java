package tp6_ComputerCenter;

public class ProcessToRun implements Comparable<ProcessToRun> {
	private static int id;
	private int numberId;
	private int memoryRequirement;
	private boolean wasEjecuted;
	
	public ProcessToRun(int memoryRequirement) {
		this.memoryRequirement = memoryRequirement;
		this.wasEjecuted = false;
		this.numberId = id++;
	}

	@Override
	public int compareTo(ProcessToRun processToRun) {
		int result = 0;
		int myMemory = this.getMemoryRequirement();
		int memoryRequirement = processToRun.getMemoryRequirement();
		if (memoryRequirement > myMemory) {
			result = 1;
		} else if (memoryRequirement < myMemory) {
			result = -1;
		}
		return result;
	}	
	@Override
	public boolean equals(Object obj) {
		try {
			ProcessToRun aux = (ProcessToRun) obj;
			return this.getNumberId() == aux.getNumberId();
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return	"\n------------------------------------" +
				"\nPROCESO A EJECUTAR" +
				"\nId: " + this.getNumberId() +
				"\nMemoria requerida: " + this.getMemoryRequirement() + 
				"\nEjecución finalizada: " + this.wasEjecuted();
	}


	//GETTERS & SETTERS
	public boolean wasEjecuted() {
		return wasEjecuted;
	}

	public void setWasEjecuted(boolean wasEjecuted) {
		this.wasEjecuted = wasEjecuted;
	}

	public int getMemoryRequirement() {
		return memoryRequirement;
	}

	public int getNumberId() {
		return numberId;
	}
	
	
}
