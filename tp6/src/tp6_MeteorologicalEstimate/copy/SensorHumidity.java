package tp6_MeteorologicalEstimate.copy;

public class SensorHumidity extends Sensor {
	public SensorHumidity() {
	}

	
	@Override
	public boolean isBiggerValue(Register register, int humidity) {
		return register.getHumidity() < humidity;

	}


}
