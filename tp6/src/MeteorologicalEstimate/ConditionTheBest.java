package MeteorologicalEstimate;

public class ConditionTheBest extends Condition {

	public ConditionTheBest(Sensor sensor, int maxValue, int lastRegisters) {
		super(sensor, maxValue, lastRegisters);
	}

	@Override
	public boolean willRain() {
		return this.sensor.getTheHighest(lastRegisters) > this.maxValue;
	}

}
