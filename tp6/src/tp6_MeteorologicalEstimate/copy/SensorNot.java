package tp6_MeteorologicalEstimate.copy;

public class SensorNot extends Sensor {
	public Sensor sensor;
	public SensorNot(Sensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public boolean isBiggerValue(Register register, int maxParameter) {
		return !this.sensor.isBiggerValue(register, maxParameter);
	}

}
