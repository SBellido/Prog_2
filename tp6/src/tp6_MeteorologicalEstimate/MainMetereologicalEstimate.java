package tp6_MeteorologicalEstimate;
/*
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
public class MainMetereologicalEstimate {

	public static void main(String[] args) {

// INSTANCIAS
	Sensor sensor1 = new Sensor(54, 25, 110, 35);
	WeatherStation wS1 = new WeatherStation("Tandil", sensor1);
	
	
	RegisterHumidity register1 = new RegisterHumidity(3);
	RegisterTemp register2 = new RegisterTemp(2);
	RegisterRain register3 = new RegisterRain(4);
	RegisterWind register4 = new RegisterWind(2);
	
	
	register1.addRegister(50);
	register1.addRegister(30);
	register1.addRegister(20);
	register1.addRegister(10);
	
	register2.addRegister(17);
	register2.addRegister(25);
	register2.addRegister(30);
	register2.addRegister(35);
	
	register3.addRegister(200);
	register3.addRegister(100);
	register3.addRegister(120);
	register3.addRegister(50);
	
	register4.addRegister(10);
	register4.addRegister(35);
	register4.addRegister(50);
	register4.addRegister(90);
	
	sensor1.addRegister(register1);
	sensor1.addRegister(register2);
	sensor1.addRegister(register3);
	sensor1.addRegister(register4);
	
	

	
	System.out.println(wS1);
	
	System.out.println("\nPronóstico de Lluvia en " + wS1.getName() + " es " +
			wS1.willRain());
	}

}
