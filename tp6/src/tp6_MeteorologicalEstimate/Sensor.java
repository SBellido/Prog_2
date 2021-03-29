package tp6_MeteorologicalEstimate;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
	private int maxHumid;
	private int maxTemp;
	private int maxRain;
	private int maxWind;
	private List<Register> registers;
	
	public Sensor() {}
	public Sensor(int maxHumid, int maxTemp, int maxRain, int maxWind) {
		this.maxHumid = maxHumid;
		this.maxTemp = maxTemp;
		this.maxRain = maxRain;
		this.maxWind = maxWind;
		this.registers = new ArrayList<>();		
	}
	
	
 
	public void addRegister(Register register) {
		this.registers.add(register);
	}
	
	public boolean verifyregisters() {
		int countRegisters = 0;
		for (Register register : this.registers) {
			if (register.thisDataRecordRain(this)) {
				countRegisters++;
			}
		}
		return countRegisters == this.registers.size();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		try {
			Sensor aux = (Sensor) obj;
			return (this.getMaxTemp() == aux.getMaxTemp() &&
					this.getMaxHumid() == aux.getMaxHumid() &&
					this.getMaxRain() == aux.getMaxRain() &&
					this.getMaxWind() == aux.getMaxWind() &&
					this.registers.containsAll(aux.getRegisters()));
		} catch (Exception e) {
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		return "\nSENSOR" + 
				"\nValor máximo de Hum: " + this.getMaxHumid() + 
				"\nValor máximo de Temp: " + this.getMaxTemp() + 
				"\nValor máximo de Lluvia: " + this.getMaxRain() + 
				"\nValor máximo de Viento: " + this.getMaxWind() + 			
				"\nRegistros: " + this.getRegisters();
	}


	// GETTERS y SETTERS
	public int getMaxTemp() {
		return maxTemp;
	}
	public int getMaxHumid() {
		return maxHumid;
	}
	public int getMaxRain() {
		return maxRain;
	}
	public int getMaxWind() {
		return maxWind;
	}	
	public List<Register> getRegisters() {
		return new ArrayList<>(this.registers);
	}

	
}
