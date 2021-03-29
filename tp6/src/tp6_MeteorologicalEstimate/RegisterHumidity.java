package tp6_MeteorologicalEstimate;

public class RegisterHumidity extends Register {
	
	public RegisterHumidity(int registersToAverage) {
		this.registersToAverage = registersToAverage;
	}

	public RegisterHumidity() {
		this.lastRegister = this.registers.size();
	}
	
	@Override
	public boolean thisDataRecordRain(Sensor sensor) {
		if (!this.theLastOneToAverage()) {
			return sensor.getMaxHumid() < this.average();
		} else {
			return sensor.getMaxHumid() < this.registers.get(lastRegister);	
		}
	}


	// GETTERS & SETTERS

		public int getRegistersToAverage() {
			return registersToAverage;
		}

		public int getLastRegister() {
			return lastRegister;
		}

		public void setLastRegister(int lastRegister) {
			this.lastRegister = lastRegister;
		}

		public void setRegistersToAverage(int registersToAverage) {
			this.registersToAverage = registersToAverage;
		}
	
	


}
