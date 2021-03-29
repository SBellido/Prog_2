package tp8_CostConrtol;

import java.time.LocalDate;

/*
 5. Control de Gastos
 
Se desea implementar un sistema para el control de gastos de una organizaci�n. El sistema
debe poder permitir almacenar el gasto con su descripci�n, la fecha, su monto y dem�s
caracter�sticas que se le deseen incorporar. Asimismo, es posible incluir un detalle
pormenorizado sobre un gasto. De esta forma el usuario puede detallar c�mo se compone
originalmente el gasto. Por ejemplo, el gasto �construcci�n edificio� se basa en gastos en
cimientos, gastos en edificaci�n y gastos en pintura. El monto total del gasto es la suma de
cada una de las partes que lo componen.

Siempre se puede caracterizar cualquiera de los tipos de gasto acorde a lo deseado por el
usuario, por ejemplo para gastos de pintura, color rojo, calidad media, metros 35.

Se deben proveer servicios que permitan obtener:
1. El total de dinero gastado en una fecha dada.
2. El total de dinero que se gast� en el rubro: Alimentos.
3. Un listado con todos los gastos de una fecha dada.
4. Un listado con todos los gastos de calidad media que se hicieron.
5. El total de dinero que se  gast� en pintura, en una fecha dada.
6. Un listado de todos los gastos que superen los 1556 pesos.
7. Estos son solo algunos ejemplos de listados y sumas de gastos que se pueden
solicitar. Es posible que se combinen distintas formas de pedir sumas o listados.

Aclaraci�n sobre los listados de gastos: Cuando se trabaja con un gasto que se encuentra
detallado se debe proceder de la siguiente forma. Por ejemplo, si se solicitan los productos
de calidad alta, y el gasto (que est� detallado) posee una calidad alta, este gasto es incluido en
el listado, ahora s� el mismo NO posee calidad alta pero dentro del detalle hay gastos que s�
poseen calidad alta, estos �ltimos son los que deben ser incluidos en el listado.

Proveer la funcionalidad necesaria para el siguiente tipo de gasto: la organizaci�n administra
un caso de gasto pendiente de pago. Dicho gasto puede ser cualquier tipo existente (un gasto
simple o un gasto detallado) o cualquier tipo de gasto que se agregue en un futuro, tiene un
porcentaje de actualizaci�n anual, la cantidad de d�as pendiente, si el mismo ya se pag� o est�
pendiente, y el monto se calcula en base al gasto contenido m�s el porcentaje acorde a los
d�as pendiente de pago. Si ya se pag� el monto es un valor fijo, calculado al momento que se
inform� el pago. Implementar la funcionalidad que permita informar el pago del gasto y fijar
el valor de dicho monto.

 */
public class MainCostControl {

	public static void main(String[] args) {
		
		CompositeExpense compositeExpenseEdificio = new CompositeExpense("construcci�n edificio");
		CompositeExpense compositeExpenseDeptos = new CompositeExpense("construcci�n departamentos");
		
		SimpleExpense simpleExpenseCimientos = new SimpleExpense("cimientos", 25000.8);
//		SimpleExpense simpleExpenseEdificaci�n = new SimpleExpense("edificaci�n", 35000.20);
//		SimpleExpense simpleExpensePintura = new SimpleExpense("pintura", 1250.50);		
//		SimpleExpense simpleExpenseAberturas = new SimpleExpense("aberturas", 3520.60);
		SimpleExpense simpleExpenseGas = new SimpleExpense("instalaci�n de gas", 4520.50);
		SimpleExpense simpleExpenseAgua = new SimpleExpense("instalaci�n de agua", 3020.50);
		
		DinamicAttribute attributeColor = new DinamicAttribute("color", "rojo");
//		DinamicAttribute attributeMetros = new DinamicAttribute("metros", 35);
		DinamicAttribute attributeFecha = new DinamicAttribute("fecha", LocalDate.of(2020, 12, 31));
//		DinamicAttribute attributeFecha1 = new DinamicAttribute("fecha", LocalDate.of(2019, 10, 27));
		DinamicAttribute attributeRubro = new DinamicAttribute("rubro", "instalaci�n");
		
		DinamicAttribute attributeCalidadAlta = new DinamicAttribute("calidad", "alta");
		DinamicAttribute attributeCalidadMedia = new DinamicAttribute("calidad", "media");
		DinamicAttribute attributeCalidadBaja = new DinamicAttribute("calidad", "baja");
		
		CriteriaDinamic criteriaCalidadAlta = new CriteriaDinamic(attributeCalidadAlta);
		CriteriaDinamic criteriaCalidadMedia = new CriteriaDinamic(attributeCalidadMedia);
		CriteriaDinamic criteriaCalidadBaja = new CriteriaDinamic(attributeCalidadBaja);
		CriteriaDinamic criteriaColor = new CriteriaDinamic(attributeColor);
		CriteriaDinamic criteriaFecha = new CriteriaDinamic(attributeFecha);
		CriteriaDinamic criteriaNot = new CriteriaDinamic(attributeFecha);
		CriteriaDinamic criteriaRubro = new CriteriaDinamic(attributeRubro);
		CriteriaAnd criteriaAnd = new CriteriaAnd(criteriaFecha, criteriaRubro);
		
		simpleExpenseCimientos.addDinamicAttribute("color", "rojo");
		simpleExpenseCimientos.addDinamicAttribute("metros", 35);
		simpleExpenseCimientos.addDinamicAttribute("fecha", LocalDate.of(2020, 12, 31));
		simpleExpenseCimientos.addDinamicAttribute("calidad", "alta");
		
		simpleExpenseAgua.addDinamicAttribute("color", "rojo");
		simpleExpenseAgua.addDinamicAttribute("fecha", LocalDate.of(2020, 12, 31));		
		simpleExpenseAgua.addDinamicAttribute("calidad", "media");
		simpleExpenseAgua.addDinamicAttribute("rubro", "instalaci�n");
		simpleExpenseGas.addDinamicAttribute("rubro", "instalaci�n");		
		simpleExpenseGas.addDinamicAttribute("calidad", "alta");
		
//		compositeExpenseDeptos.addExpense(simpleExpensePintura);
//		compositeExpenseDeptos.addExpense(simpleExpenseAberturas);
		compositeExpenseDeptos.addExpense(simpleExpenseGas);
		compositeExpenseDeptos.addDinamicAttribute("calidad", "baja");
		
		compositeExpenseEdificio.addExpense(compositeExpenseDeptos);
		compositeExpenseEdificio.addExpense(simpleExpenseCimientos);
		compositeExpenseEdificio.addExpense(simpleExpenseAgua);
//		compositeExpenseEdificio.addExpense(simpleExpenseGas);
		compositeExpenseEdificio.addDinamicAttribute("calidad", "baja");
		
		compositeExpenseEdificio.addExpense(simpleExpenseGas);
		
//		System.out.println(compositeExpenseEdificio.enumExpenses());
//		System.out.println(compositeExpenseEdificio.getAmount());	
		System.out.println(compositeExpenseEdificio.getTotalAmount(criteriaRubro));
		
		System.out.println(compositeExpenseEdificio.getElementExpense(criteriaCalidadAlta));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


