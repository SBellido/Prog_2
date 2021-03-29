package tp6_MeteorologicalEstimate;

import java.util.ArrayList;
import java.util.List;


public abstract class Register {
	private final int LASTHOUR = 24;
	protected int registersToAverage;
	protected int lastRegister;
	protected List<Integer> registers = new ArrayList<>();
	
	public abstract boolean thisDataRecordRain(Sensor sensor);
	
	protected boolean theLastOneToAverage() {
		return this.registersToAverage == 0;
	}
	
	protected int average() {
		int count = 0;
		int sum = 0;
		int average = 0;
		int regToAverage = this.getRegistersToAverage();
		if (!this.registers.isEmpty() && this.registers.size() >= regToAverage) {
			for (Integer register : this.registers) {
				if (count <= regToAverage) {
					sum += this.registers.get(register);
					count++;
				}
			}
			average = sum / regToAverage;
		}
		return average;
	}
	
	public void addRegister(int register) {
		if (this.registers.size() < LASTHOUR) {
			this.registers.add(register);
		}
	}
	
	@Override
	public String toString() {
		return "\nRegistros" + 
				"\nRegistros a promediar: " + this.getRegistersToAverage() + 
				"\nCantidad de registros: " + this.getLastRegister() + 
				"\nListado de registros: " + this.getRegisters();
	}

//
//	public int getRandom() {
//		return (int) (Math.floor(Math.random() * (MAXRAIN - MINRAIN)) + MINRAIN);
//	}
//	public void addAllRegisterRain(int registerRain) {
//		for (int i = 0; i < LASTHOUR; i++) {
//			registerRain = getRandom();
//			this.rainDay.add(registerRain);		
//		}
//	}
// GETTERS & SETTERS

	public int getRegistersToAverage() {
		return registersToAverage;
	}

	public int getLastRegister() {
		return lastRegister;
	}

	public List<Integer> getRegisters() {
		return new ArrayList<>(this.registers);
	}

	public void setLastRegister(int lastRegister) {
		this.lastRegister = lastRegister;
	}

	public void setRegistersToAverage(int registersToAverage) {
		this.registersToAverage = registersToAverage;
	}
}
