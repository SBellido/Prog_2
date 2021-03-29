package tp6_MeteorologicalEstimate;

public class RegisterRain extends Register {
	

	public RegisterRain(int registersToAverage) {
		this.registersToAverage = registersToAverage;
	}
	public RegisterRain() { 
		this.lastRegister = this.registers.size();
	}

	@Override
	public boolean thisDataRecordRain(Sensor sensor) {
		if (!this.theLastOneToAverage()) {
			return sensor.getMaxRain() < this.average();
		} else {
			return sensor.getMaxRain() < this.registers.get(lastRegister);	
		}
	}	
	
	

}
