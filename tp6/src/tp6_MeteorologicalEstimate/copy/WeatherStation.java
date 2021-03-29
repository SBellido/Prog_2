package tp6_MeteorologicalEstimate.copy;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
	private int maxPromLastReg;
	private int maxRegister;
	private int maxLastReg;
	private int maxValue;
	List<Register> registers;
	List<Sensor> sensors;
	
	public WeatherStation() {}
	public WeatherStation(int maxPromLastReg, int maxRegister, int maxLastReg, int maxValue) {
		this.maxPromLastReg = maxPromLastReg;
		this.maxRegister = maxRegister;
		this.maxLastReg = maxLastReg;
		this.maxValue = maxValue;
		this.registers = new ArrayList<>();
		this.sensors = new ArrayList<>();
	}

	
//	public void controlMaxValueLastRegisters() {
//		int registers = this.getMaxRegister();
//		int maxValue = 0;
//		for (int i = 0; i < registers; i++) {
//			Register register = this.registers.get(i);
////			if (maxValue < register) {
////				
////			}
//			
//		}
//	 }


	
	public boolean willRain(Register register, int value) {
		return false;
	}


// GETTERS	
	public int getMaxValue() {
		return this.maxValue;
	}
	public int getMaxPromLastReg() {
		return maxPromLastReg;
	}
	public int getMaxLastReg() {
		return maxLastReg;
	}
	public int getMaxRegister() {
		return maxRegister;
	}
	public List<Register> getRegisters() {
		return new ArrayList<>(this.registers);
	}
	public List<Sensor> getSensors() {
		return new ArrayList<>(this.sensors);
	}
	
// SETTERS
	public void setMaxPromLastReg(int maxPromLastReg) {
		this.maxPromLastReg = maxPromLastReg; 
	}
	public void setMaxLastReg(int maxLastReg) {
		this.maxLastReg = maxLastReg;
	}
	public void setMaxRegister(int maxRegister) {
		this.maxRegister = maxRegister;
	}
	
	
	
	
}
