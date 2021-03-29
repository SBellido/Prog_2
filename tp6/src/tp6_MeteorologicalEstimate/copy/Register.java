package tp6_MeteorologicalEstimate.copy;

import java.util.ArrayList;
import java.util.List;

public class Register {
	private final int LASTHOUR = 23;
	private int temp;
	private int humidity;
	private int windSpeed;
	private int milimetersRain;
	private List<Integer> rainDay;

	public Register() { }
	public Register(int temp, int grade, int windSpeed, int milimetersRain) {
		this.temp = temp;
		this.humidity = grade;
		this.windSpeed = windSpeed;
		this.milimetersRain = milimetersRain;
		this.rainDay = new ArrayList<>();
	}

	public void addRegisterRain(int registerRain) {
		if (this.rainDay.size() < LASTHOUR) {
			this.rainDay.add(registerRain);
		}
	}
	
// GETTERS
	public int getLASTHOUR() {
		return LASTHOUR;
	}	
	public int getTemp() {
		return temp;
	}
	public int getHumidity() {
		return humidity;
	}
	public int getWindSpeed() {
		return windSpeed;
	}
	public int getMilimetersRain() {
		return milimetersRain;
	}
	public List<Integer> getRainDay() {
		return new ArrayList<>(this.rainDay);
	}
	
// SETTERS	
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
	public void setMilimetersRain(int milimetersRain) {
		this.milimetersRain = milimetersRain;
	}	




	
}
