package MeteorologicalEstimate;

public abstract class Condition {
	protected Sensor sensor;
	protected int maxValue;
	protected int lastRegisters;
 
	public Condition() {}
	public Condition(Sensor sensor, int maxValue, int lastRegisters) {
		this.sensor = sensor;
		this.maxValue = maxValue;
		this.lastRegisters = lastRegisters;
	}
	
	public abstract boolean willRain();

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public void setLastRegisters(int lastRegisters) {
		this.lastRegisters = lastRegisters;
	}

	
}
