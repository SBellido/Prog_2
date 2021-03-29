package tp6_MeteorologicalEstimate;

public class RegisterNot extends Register {
	public Register register;
	public RegisterNot(Register register) {
		this.register = register;
	}

	@Override
	public boolean thisDataRecordRain(Sensor sensor) {
		return !this.register.thisDataRecordRain(sensor);
	}

}
