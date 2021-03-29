package tp9_Aseguradora;

import java.time.LocalDate;

/*
 * 5. Aseguradora
Una aseguradora provee distintos tipos de seguros dentro de su cartera, entre los mismos se encuentran:

● Seguro Automotor, en el cual se cuenta con un número de póliza y el tipo de la misma, el
vehículo asegurado, patente entre otros atributos que el asegurador desee guardar al momento
de realizar la póliza.

● Seguro Empleado, donde se registra el DNI del empleado, su edad, nombre y apellido, el
número de póliza, el tipo de póliza y demás información que pueda ser relevante.

● Seguro Hogar, en el cual se guarda la dirección, el tipo de vivienda (casa, depto, ..) número de
póliza y tipo, color de la pared entre otros tantos atributos que se desea almacenar en relación
con la vivienda.

● Seguro Integrador, (pensado para una familia) en el cual se guarda un paquete de seguros
especiales (automotor, Hogar, y cualquier otro tipo de seguro que ofrezca o pueda ofrecer la
compañía).

● Seguro Colectivo, común en consorcios, en donde se mantienen los seguros de los empleados
que posee el edificio y también los seguros integradores de las personas que viven en el edificio
(se pueden agregar distintos tipos de seguro que ofrezca o pueda ofrecer la compañía)

● Seguro Especial Viajero, es un seguro que se aplica durante un intervalo de tiempo, este
servicio se brinda sobre cualquier tipo de seguro que brinda o pueda brindar la organización.
Tiene una fecha de inicio y una fecha de fin definidas.

Se desea brindar listados en los cuales se incluyan todos los seguros que posee la compañía. A
continuación se listan algunos ejemplos.
a) Listar todos los seguros cuyo tipo de póliza sea igual a “automotor”
b) Listar todos los seguros cuyo tipo de póliza “hogar” y el color de la pared sea rojo.
c) Listar todos los seguros donde haya un DNI relacionado igual a 24.134.323.
d) Se pueden agregar nuevos tipos de búsquedas así como también combinaciones lógicas de las
mismas (AND, OR, NOT).

NOTA: en el caso de seguro integrador o colectivo el resultado de la búsqueda solo incluye
cualquier seguro que ellos posean y cumple con la búsqueda. En el caso de Seguro especial viajero
se devuelven los seguros que este contenga solo si el seguro se encuentra activo, es decir que la
fecha actual está dentro del rango de fecha de aplicabilidad del seguro, en caso contrario no retorna
nada.

Asimismo cada seguro posee un precio asociado. En el caso de un seguro integrador el monto a
cobrar será el que resulte de la suma de la totalidad de los seguros que comprende menos un 10 %
de descuento, en el caso del seguro colectivo el descuento es de 15%. En el caso del Seguro
Especial Viajero posee un costo adicional del 20% sobre la suma de él o los seguros contenidos,
siempre y cuando el seguro se encuentre activo (en caso opuesto es 0).
 
Se deben proveer mecanismos que permitan obtener el listado de seguros acorde a alguna condición
de las planteadas en los incisos a, b, c, d; así como también calcular el precio de un seguro.
 */
public class MainAseguradora {

	public static void main(String[] args) {
		AtributoDinamico nombreCompleto = new AtributoDinamico("Nombre completo", "Juan Carlos Rodriguez");
		AtributoDinamico dni = new AtributoDinamico("DNI", 27388144);
		AtributoDinamico edad = new AtributoDinamico("edad", 41);
		AtributoDinamico tipoDePoliza = new AtributoDinamico("Tipo", "automotor");
		AtributoDinamico patente = new AtributoDinamico("Patente", "AOX-266");
		
		AtributoDinamico nombreCompleto1 = new AtributoDinamico("Nombre completo", "José Pérez");
		AtributoDinamico dni1 = new AtributoDinamico("DNI", 36485972);
		AtributoDinamico edad1 = new AtributoDinamico("edad", 45);
		AtributoDinamico tipoDePoliza1 = new AtributoDinamico("Tipo", "hogar");
		AtributoDinamico pared = new AtributoDinamico("Color pared", "rojo");
		
		SeguroSimple poliza = new SeguroSimple(300.0);
		SeguroSimple poliza1 = new SeguroSimple(200.0);
		
		CriterioAtributoDinamico criterio = new CriterioAtributoDinamico(dni);
		
		poliza.agregarAtributo(nombreCompleto);
		poliza.agregarAtributo(dni);
		poliza.agregarAtributo(edad);
		poliza.agregarAtributo(tipoDePoliza);
		poliza.agregarAtributo(patente);
		
		poliza1.agregarAtributo(nombreCompleto1);
		poliza1.agregarAtributo(dni1);
		poliza1.agregarAtributo(edad1);
		poliza1.agregarAtributo(tipoDePoliza1);
		poliza1.agregarAtributo(pared);
		
		SeguroColectivo integrador = new SeguroColectivo(0.2);
		SeguroColectivo colectivo = new SeguroColectivo(0.5);
		SeguroTemporal temporal = new SeguroTemporal(0.3, LocalDate.of(2020, 10, 27), LocalDate.of(2020, 11, 25));
		
		temporal.agregarSeguro(poliza);
		temporal.agregarSeguro(poliza1);
		
//		System.out.println(temporal);
		System.out.println(temporal.listarSeguros(criterio));
	}

}
