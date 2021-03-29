package tp6_MeteorologicalEstimate;


public class RegisterTemp extends Register {

	public RegisterTemp(int registersToAverage) {
		this.registersToAverage = registersToAverage;
	}

	public RegisterTemp() {
		this.lastRegister = this.registers.size();
	}

	@Override
	public boolean thisDataRecordRain(Sensor sensor) {
		if (!this.theLastOneToAverage()) {
			return sensor.getMaxTemp() < this.average();
		} else {
			return sensor.getMaxTemp() < this.registers.get(lastRegister);
		}
	}

	@Override
	public String toString() {
		return "\nÚltimo registro de Temperatura: " + this.getLastRegister();
	}



}
