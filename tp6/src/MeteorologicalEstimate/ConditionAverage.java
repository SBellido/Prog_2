package MeteorologicalEstimate;

public class ConditionAverage extends Condition {

	public ConditionAverage(Sensor sensor, int maxValue, int lastRegisters) {
		super(sensor, maxValue, lastRegisters);
	}

	@Override
	public boolean willRain() {
		return this.sensor.average(lastRegisters) > maxValue;
	}

}
