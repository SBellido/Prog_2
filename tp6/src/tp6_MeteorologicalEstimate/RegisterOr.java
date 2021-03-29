package tp6_MeteorologicalEstimate;

public class RegisterOr extends Register {
	private Register registerFirst;
	private Register registerSecond;

	public RegisterOr(Register registerFirst, Register registerSecond) {
		this.registerFirst = registerFirst;
		this.registerSecond = registerSecond;
	}

	@Override
	public boolean thisDataRecordRain(Sensor sensor) {
		return (this.registerFirst.thisDataRecordRain(sensor) ||
				this.registerSecond.thisDataRecordRain(sensor));
	}

}
