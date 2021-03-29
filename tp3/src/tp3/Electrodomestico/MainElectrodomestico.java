
/*
 * 2 Electrodom√©sticos
Crear una clase Electrodom√©stico con las siguientes caracter√≠sticas:
Atributos son nombre, precio base, color, consumo energ√©tico y peso.
Valores por defecto:
‚ó? El color por defecto es gris plata.
‚ó? El consumo energ√©tico 10 Kw.
‚ó? Precio base 100 pesos.
‚ó? El peso es 2 kg.
Implementar todos los constructores.
La funcionalidad de la clase es la siguiente:
‚ó? Todos los m√©todos get y set.
‚ó? Comprobar si el electrodom√©stico es de bajo consumo (menor que 45 Kw)
‚ó? Calcular el balance, el mismo es el resultado de dividir el costo por el peso
‚ó? Indicar si un producto es de alta gama, el balance es mayor que 3
 */
package tp3.Electrodomestico;

public class MainElectrodomestico {

	public static void main(String[] args) {
		Electrodomestico cafetera = new Electrodomestico();
		Electrodomestico tetera = new Electrodomestico("Super Tetera");
		Electrodomestico batidora = new Electrodomestico("Bati Dora", "Negro Mate", 46, 150.8, 2.5);

		System.out.println(batidora.toString()); 
		System.out.println(tetera.toString());
		System.out.println(cafetera.toString());
		
		cafetera.setConsumption(20);
		cafetera.setPrice(200);
		cafetera.setWeight(4);
		
	}

}
