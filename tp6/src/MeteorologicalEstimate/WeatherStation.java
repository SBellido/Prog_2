package MeteorologicalEstimate;

public class WeatherStation {
	private String name;
	private Sensor rainfall;
	private Sensor humidity;
	private Sensor wind;
	private Sensor temp;
	private Condition condition;
	
	public WeatherStation(String name, Sensor rainfall,	Sensor humidity, Sensor wind, Sensor temp, Condition condition) {
		this.name = name;
		this.rainfall = rainfall;
		this.humidity = humidity;
		this.wind = wind;
		this.temp = temp;
		this.condition = condition;
	}
	
	public boolean willRain() {
		return this.condition.willRain();
	}

	
//	GETTERS & SETTERS
	public Condition getCondition() {
		return this.condition;
	}
	
	public String getName() {
		return name;
	}

	public Sensor getRainfall() {
		return rainfall;
	}

	public Sensor getHumidity() {
		return humidity;
	}

	public Sensor getWind() {
		return wind;
	}

	public Sensor getTemp() {
		return temp;
	}
	
	
}
