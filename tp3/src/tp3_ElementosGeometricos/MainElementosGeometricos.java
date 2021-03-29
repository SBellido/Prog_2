/*
 * 3 Elementos Geométricos
Implementar la clase punto geométrico, la cual posee dos valores de coordenada X, Y.
El valor por defecto de los mismos es (0,0)
La funcionalidad que posee la clase es la siguiente:
�? Desplazar el punto en el plano. Se encarga de trasladar el punto a otra posición
del plano. Para esto se incrementan los valores de X e Y en una cierta cantidad
(cierto desplazamiento en X y cierto desplazamiento en Y).
�? Calcular la distancia euclídea. Dado un punto es posible establecer la distancia
euclídea con otro punto acorde a la siguiente formula:
Distancia 2 = ( X1 – X2 ) 2 + (Y1 – Y2) 2
 La clase Math de Java define un método de clase sqrt para el cálculo de la raíz
cuadrada.
Implementar la clase Rectángulo.
Para esta clase es necesario definir el rectángulo utilizando los puntos como vértices. Se
trabajará con Rectángulos cuyos lados estén paralelos a los ejes.
Nota. Definir la estructura que deber poseer un rectángulo y en base a esto implementar
los atributos de la clase.
La funcionalidad que debe proveer un rectángulo es la siguiente
�? Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
Y.
�? Calcular el �?rea del rectángulo.
�? Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
del mismo es mayor que la del otro.
�? Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
propiedades para que sea un cuadrado.
�? Determinar el largo del lado superior.
�? Determinar si está acostado o parado (si el alto es más que el ancho). 
 */
package tp3_ElementosGeometricos;

public class MainElementosGeometricos {

	public static void main(String[] args) {
		GeometricPoint point1 = new GeometricPoint(1, 3);
		GeometricPoint point2 = new GeometricPoint(4, 5);
		GeometricPoint point3 = new GeometricPoint(10, 2);
		GeometricPoint point4 = new GeometricPoint(15, 8);
		
		GeometricPoint point5 = new GeometricPoint(10, 15);
		GeometricPoint point6 = new GeometricPoint(4, 9);
		GeometricPoint point7 = new GeometricPoint(1, 10);
		GeometricPoint point8 = new GeometricPoint(4, 5);
		

//		
		System.out.println("La distancia en X es: "+point1.calculateDistanceX(point2));
		System.out.println("La distancia en Y es: "+point1.calculateDistanceY(point2));
		
		Rect rect = new Rect(point1, point2, point3, point4);
		System.out.println("La cantidad de rectángulos creados es: "+Rect.getAmountCreated());
		System.out.println("El largo superior mide: "+rect.topSideLength());
		
		Rect rect1 = new Rect(point5, point6, point7, point8);
		System.out.println("La cantidad de rectángulos creados es: "+Rect.getAmountCreated());
//		
		System.out.println(rect.toString());
		System.out.println(rect1.toString());
		System.out.println("La altura es: "+rect.calculateHeight());
		System.out.println("La base es: "+rect.calculateBase());
		System.out.println("EL área es: "+rect.calculateArea());
		System.out.println("La altura es: "+rect1.calculateHeight());
		System.out.println("La base es: "+rect1.calculateBase());
		System.out.println("El área es: "+rect1.calculateArea());
		System.out.println("¿Es mayor? "+rect1.isBigger(rect));
		System.out.println("¿Es cuadrado? "+rect.isSquare());
		System.out.println("¿Es horizontal? "+rect.isHorizontal());
				rect.drawRect(point1, point3, point4, point4);
		System.out.println("El área del rectángulo es: "+rect.calculateArea());
		rect.shiftRect(4, 2);
		System.out.println(rect.toString());

		
		
//		Rectangle rec1 = new Rectangle(point1, point3);
//	
//		rec1.setVertexTwo(point2);
//		
//		rec1.setVertexFour(point4);		
//		System.out.println(point1.toString()); 
//		point1.setX(4);
//		point1.setY(10);
//		System.out.println(point1.toString()); 
//		point1.shiftPoint(4, 4);
//		System.out.println(point1.toString()); 
//		
//		System.out.println(point1.calculateEuclideanDistance(point3.getX(), point3.getY())+
//		" es la distancia euclídea entre los puntos"+
//		"\nX1: "+point1.getX()+" / Y1: " +point1.getY()+
//		"\nX2: "+point3.getX()+" / Y2: "+point3.getY()); 
//		
//		System.out.println(rec1.toString());
//
	}

}
