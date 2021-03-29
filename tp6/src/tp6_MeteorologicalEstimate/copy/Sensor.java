package tp6_MeteorologicalEstimate.copy;

public abstract class Sensor {
	public int maxParameter;
	
	public abstract boolean isBiggerValue(Register register, int maxParameter);
}
