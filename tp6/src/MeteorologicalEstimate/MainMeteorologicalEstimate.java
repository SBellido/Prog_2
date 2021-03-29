package MeteorologicalEstimate;
/*
 * /*
 * 2. Estación meteorológica
Una estación meteorológica recibe información de diferentes sensores: temperatura (en °C),
humedad (en %) y velocidad del viento (en Km/h). Estos sensores proveen a la estación la
información correspondiente en diferentes intervalos de tiempo (no toda la información llega
en el mismo momento). Asimismo, la estación almacena la cantidad de lluvia registrada cada
hora del día (en milímetros).

Una estación meteorológica, además de registrar toda la información anterior, provee
funcionalidad para predecir si va a llover en la próxima hora. La predicción se realiza
siguiendo diferentes algoritmos que dependen de la estación y se basan en la observación del
promedio en los últimos X registros de la información de ciertos sensores, el valor máximo
de los últimos N registros, y/o la observación del último valor registrado de uno o más de
ellos. 

Por ejemplo:
● la estación meteorológica de la ciudad de Tandil predice que va a llover en la próxima
hora si el promedio de las precipitaciones de los últimos 8 registros no supera los 110
mm y la temperatura máxima de los últimos 12 registros es mayor a 25°C;

● la estación de la ciudad de María Ignacia Vela predice que va a llover si el último
registro de humedad es mayor a 54%;

● la estación de la ciudad de Balcarce predice que va a llover en la próxima hora si el
promedio de las precipitaciones de los últimos 16 registros no supera los 135mm y la
temperatura máxima de los últimos 12 registros es mayor a 28°C;

● la estación de la ciudad de Bahía Blanca predice que va a llover si la última velocidad
de viento registrada es mayor a 35 km/h, la última lluvia registrada es menor a 29 mm
y la humedad promedio de los últimos 9 registros no supera el 53%;

● la estación de la ciudad de Azul predice que va a llover si el último registro de
humedad es mayor a 63%.

NOTA: el algoritmo utilizado por cada estación es siempre el mismo; sin embargo, los
parámetros (por ejemplo, la temperatura máxima para una predicción, pueden cambiar). Por
ejemplo, después de varias predicciones erróneas, la estación e Azul decide utilizar el 96% de
humedad (en lugar del 93%), o la estación de Balcarce ahora usa los últimos 22 registros de
precipitaciones y que no superen los 124 mm, mientras que la temperatura máxima sigue
siendo de 28°C en los últimos 12 registros.
Implementar el método main para crear las estaciones meteorológicas enunciadas
anteriormente.

 */

public class MainMeteorologicalEstimate {

	public static void main(String[] args) {
		
		Sensor rainfallain = new Sensor("Lluvia");
		rainfallain.addRegister(30.0);
		rainfallain.addRegister(75.0);
		rainfallain.addRegister(10.0);
		rainfallain.addRegister(67.0);
		rainfallain.addRegister(90.0);
		rainfallain.addRegister(40.0);
		rainfallain.addRegister(30.0);
		rainfallain.addRegister(75.0);
		rainfallain.addRegister(10.0);
		rainfallain.addRegister(67.0);
		rainfallain.addRegister(67.0);
		rainfallain.addRegister(90.0);
		rainfallain.addRegister(40.0);
		rainfallain.addRegister(30.0);
		rainfallain.addRegister(75.0);
		rainfallain.addRegister(10.0);
		rainfallain.addRegister(67.0);
		rainfallain.addRegister(90.0);
		rainfallain.addRegister(40.0);
		rainfallain.addRegister(30.0);
		rainfallain.addRegister(75.0);
		rainfallain.addRegister(10.0);
		rainfallain.addRegister(67.0);
		rainfallain.addRegister(90.0);
		rainfallain.addRegister(40.0);
		
		Sensor humidity = new Sensor("Humedad");
		humidity.addRegister(20.0);
		humidity.addRegister(4.0);
		humidity.addRegister(120.0);
		humidity.addRegister(20.0);
		humidity.addRegister(60.0);
		humidity.addRegister(30.0);
		humidity.addRegister(10.0);
		humidity.addRegister(20.0);
		humidity.addRegister(4.0);
		humidity.addRegister(120.0);
		humidity.addRegister(20.0);
		humidity.addRegister(60.0);
		humidity.addRegister(30.0);
		humidity.addRegister(10.0);
		humidity.addRegister(20.0);
		humidity.addRegister(4.0);
		humidity.addRegister(120.0);
		humidity.addRegister(20.0);
		humidity.addRegister(60.0);
		humidity.addRegister(30.0);
		humidity.addRegister(10.0);
		humidity.addRegister(20.0);
		humidity.addRegister(4.0);
		humidity.addRegister(120.0);
		humidity.addRegister(20.0);
		humidity.addRegister(60.0);
		humidity.addRegister(30.0);
		humidity.addRegister(10.0);
		
		Sensor wind = new Sensor("Velocidad del viento");
		wind.addRegister(26.0);
		wind.addRegister(56.0);
		wind.addRegister(89.0);
		wind.addRegister(3.0);
		wind.addRegister(345.0);
		wind.addRegister(34.0);
		wind.addRegister(67.0);
		wind.addRegister(1.0);
		wind.addRegister(12.0);
		wind.addRegister(14.0);
		wind.addRegister(5.0);
		wind.addRegister(26.0);
		wind.addRegister(56.0);
		wind.addRegister(89.0);
		wind.addRegister(3.0);
		wind.addRegister(345.0);
		wind.addRegister(34.0);
		wind.addRegister(67.0);
		wind.addRegister(1.0);
		wind.addRegister(12.0);
		wind.addRegister(14.0);
		wind.addRegister(5.0);
		wind.addRegister(26.0);
		wind.addRegister(56.0);
		wind.addRegister(89.0);
		wind.addRegister(3.0);
		wind.addRegister(345.0);
		wind.addRegister(34.0);
		wind.addRegister(67.0);
		wind.addRegister(1.0);
		wind.addRegister(12.0);
		wind.addRegister(14.0);
		wind.addRegister(5.0);
		wind.addRegister(26.0);
		wind.addRegister(56.0);
		wind.addRegister(89.0);
		wind.addRegister(3.0);
		wind.addRegister(345.0);
		wind.addRegister(34.0);
		wind.addRegister(67.0);
		wind.addRegister(1.0);
		wind.addRegister(12.0);
		wind.addRegister(14.0);
		wind.addRegister(5.0);
		
		Sensor temp = new Sensor("Temperatura");
		temp.addRegister(54.0);
		temp.addRegister(543.0);
		temp.addRegister(45.0);
		temp.addRegister(9.0);
		temp.addRegister(3.0);
		temp.addRegister(34.0);
		temp.addRegister(54.0);
		temp.addRegister(543.0);
		temp.addRegister(45.0);
		temp.addRegister(9.0);
		temp.addRegister(3.0);
		temp.addRegister(34.0);
		temp.addRegister(54.0);
		temp.addRegister(543.0);
		temp.addRegister(45.0);
		temp.addRegister(9.0);
		temp.addRegister(3.0);
		temp.addRegister(34.0);
		temp.addRegister(54.0);
		temp.addRegister(543.0);
		temp.addRegister(45.0);
		temp.addRegister(9.0);
		temp.addRegister(3.0);
		temp.addRegister(34.0);
		temp.addRegister(54.0);
		temp.addRegister(543.0);
		temp.addRegister(45.0);
		temp.addRegister(9.0);
		temp.addRegister(3.0);
		temp.addRegister(34.0);
		temp.addRegister(54.0);
		temp.addRegister(543.0);
		temp.addRegister(45.0);
		temp.addRegister(9.0);
		temp.addRegister(3.0);
		temp.addRegister(34.0);
		temp.addRegister(54.0);
		temp.addRegister(543.0);
		temp.addRegister(45.0);
		temp.addRegister(9.0);
		temp.addRegister(3.0);
		temp.addRegister(34.0);
		
		Condition condition1 = new ConditionTheBest(rainfallain, 16, 135);
		Condition condition2 = new ConditionAverage(humidity, 9, 53);
		Condition condition3 = new ConditionAnd(condition1, condition2);

		WeatherStation WeatherStationTandil = new WeatherStation(
				"Tandil", rainfallain, humidity, wind, temp, condition3);
		System.out.println(WeatherStationTandil.willRain());
	}

}
