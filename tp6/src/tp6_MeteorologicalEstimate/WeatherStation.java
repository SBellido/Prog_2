package tp6_MeteorologicalEstimate;


public class WeatherStation {
	private String name;	
	private Sensor sensor;
	
	public WeatherStation(String name, Sensor sensor) {
		this.name = name;
		this.sensor = sensor;
	}

	
	public boolean willRain() {
		return this.sensor.verifyregisters();
	}
	
	@Override
	public String toString() {
		return "ESTACIÓN METEOROLÓGICA" + 
				"\nNombre:" + this.getName() + 
				"\nSensor: " + this.getSensor();
	}


	// GETTERS
	public String getName() {
		return name;
	}


	public Sensor getSensor() {
		return this.sensor;
	}
	

}
