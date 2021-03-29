package tp6_MeteorologicalEstimate.copy;


public class SensorRain extends Sensor {

	public SensorRain() { }

	@Override
	public boolean isBiggerValue(Register register, int milimeters) {
		return register.getMilimetersRain() < milimeters;

	}
	
	

}
