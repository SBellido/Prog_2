package tp6_MeteorologicalEstimate.copy;

public class SensorOr extends Sensor {
	private Sensor sensorFirst;
	private Sensor sensorSecond;

	public SensorOr(Sensor sensorFirst, Sensor sensorSecond) {
		this.sensorFirst = sensorFirst;
		this.sensorSecond = sensorSecond;
	}

	@Override
	public boolean isBiggerValue(Register register, int maxParameter) {
		return (this.sensorFirst.isBiggerValue(register, maxParameter) ||
				this.sensorSecond.isBiggerValue(register, maxParameter));
	}

}
