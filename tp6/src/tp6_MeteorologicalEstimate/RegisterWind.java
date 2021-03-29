package tp6_MeteorologicalEstimate;


public class RegisterWind extends Register {
	
	public RegisterWind(int registersToAverage) {
		this.registersToAverage = registersToAverage;
	}

	public RegisterWind() {
		this.lastRegister = this.registers.size();
	}
	
	@Override
	public boolean thisDataRecordRain(Sensor sensor) {
		if (!this.theLastOneToAverage()) {
			return sensor.getMaxWind() < this.average();
		} else {
			return sensor.getMaxWind() < this.registers.get(lastRegister);	
		}
	}

	
}
