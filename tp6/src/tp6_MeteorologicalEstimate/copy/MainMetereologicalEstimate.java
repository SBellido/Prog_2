package tp6_MeteorologicalEstimate.copy;
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
�? la estación meteorológica de la ciudad de Tandil predice que va a llover en la próxima
hora si el promedio de las precipitaciones de los últimos 8 registros no supera los 110
mm y la temperatura máxima de los últimos 12 registros es mayor a 25°C;

�? la estación de la ciudad de María Ignacia Vela predice que va a llover si el último
registro de humedad es mayor a 54%;

�? la estación de la ciudad de Balcarce predice que va a llover en la próxima hora si el
promedio de las precipitaciones de los últimos 16 registros no supera los 135mm y la
temperatura máxima de los últimos 12 registros es mayor a 28°C;

�? la estación de la ciudad de Bahía Blanca predice que va a llover si la última velocidad
de viento registrada es mayor a 35 km/h, la última lluvia registrada es menor a 29 mm
y la humedad promedio de los últimos 9 registros no supera el 53%;

�? la estación de la ciudad de Azul predice que va a llover si el último registro de
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
		// TODO Auto-generated method stub

	}

}
