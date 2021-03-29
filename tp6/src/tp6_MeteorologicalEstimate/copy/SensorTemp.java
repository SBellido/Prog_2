package tp6_MeteorologicalEstimate.copy;

public class SensorTemp extends Sensor {
	
	public SensorTemp() {
	}

	@Override
	public boolean isBiggerValue(Register register, int temp) {
		return register.getTemp() < temp;
	}

	

}
