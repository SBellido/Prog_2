package tp9_EnvioPostal;
/*
 * /*
 2. Sistema Postal
 
Una compañía de envíos posee distintos tipos de servicios de envíos, entre los mismos se encuentran:

�? Envío de paquetes y cartas, una carta/paquete posee un destinatario con su dirección, un
remitente con su dirección, si la retiran en la sucursal de destino o la envían a domicilio, y su peso.

�? Combo Postal, es una modalidad por la cual se agrupa un conjunto de envíos (cualquier tipo de
envío). Todos los envíos incluidos en un combo postal deben tener una ciudad determinada (por ejemplo “Tandil�?).

�? Combo empresarial, esta modalidad se utiliza para el envío de mercadería para portales de venta
online. Todos los envíos que agrupa poseen un remitente dado (por ejemplo UNICEN). 
Pueden agruparse cualquier tipo de envío.

�? Combo servicios, Se provee un servicio que permite a las empresas de servicios repartir sus
boletas/mercadería. Todos los envíos que se agregan a este combo (de cualquier tipo que sean)
no pesan más de 300 gramos cada uno  (no importa que sea un envío de paquete, un combo
postal, combo empresarial, combo de servicios, el peso del envío que se agregue no debe
superar los 300 gr).

Cuando se agrega un envío de cualquiera de los tipos mencionados a un Combo Postal, Empresarial
o de Servicios si éste no cumple con el requisito solicitado por cada uno de ellos el mismo NO se
agrega al combo. Todos los envíos poseen un único número de tracking que permite hacer su
seguimiento. En los combos es el mismo para todos los envíos que contiene, y cuando un envío se
agrega a un combo este último cambia el tracking del envío agregado poniendo el del combo. 
El peso de los combos es la suma de todos los envíos que este contiene. Cuando se solicita el
destinatario, remitente o las dirección, en los combos se devuelve el valor del primer envío que ellos
poseen (no se tiene en cuenta el resto). Las direcciones se componen del nombre de una ciudad, una
calle y un número.

El CEO de la compañía desea en un futuro poder agregar nuevos combos los cuales tengan un cierto
requisito sobre los paquetes que pueda contener (por ejemplo solo paquetes de 3kg), e incluso
flexibilizar los combos existentes, por ejemplo que dentro del combo postal todos tengan como
destino a Mar del Plata o se envíen a Balcarce. (La solución provista debe permitir esta
funcionalidad de manera simple y clara)

Se desea brindar listados en los cuales se incluyan todos los envíos que posee la compañía. A
continuación se listan algunos ejemplos:

a) Listar todos los envíos cuyo destino sea Tandil.
b) Listar todos los envíos cuyo destino sea Tandil y calle “9 de Julio�?.
c) Listar todos los envíos cuyo destino sea Olavarría y el remitente sea de Azul.
d) Listar todos los envíos de Ned Flanders (es el remitente).
e) Se pueden agregar nuevos tipos de búsquedas así como también combinaciones lógicas de las mismas.

NOTA: en el caso de los combos el resultado de la búsqueda incluye cualquier envío que ellos
posean y cumple con la búsqueda (El combo de cualquier tipo NO se agrega al resultado).
 */

public class MainSistemaPostal {

	public static void main(String[] args) {
		Direccion unicen = new Direccion("UNICEN", "Tandil", "Paz", 321);
		Direccion particularTandil = new Direccion("Juana Gómez", "Tandil", "San Lorenzo", 654);
		Direccion particularJuarez = new Direccion("Mabel Vega", "Juárez", "Tucumán", 31);
		
		EnvioSimple carta = new EnvioSimple(123, unicen, particularTandil, true, 29);
		EnvioSimple carta1 = new EnvioSimple(396, particularJuarez, particularTandil, true, 45);
		EnvioSimple paquete = new EnvioSimple(195, particularTandil, unicen, false, 15);
		EnvioSimple paquete1 = new EnvioSimple(456, unicen, particularJuarez, false, 12);
		
		CriterioCiudadDestino criterioDestino = new CriterioCiudadDestino("Tandil");
		CriterioCiudadDestino criterioDestino1 = new CriterioCiudadDestino("Juárez");
		CriterioNombreCalle criterioCalle = new CriterioNombreCalle("Tucumán");
		CriterioNombreRemitente criterioRemitente = new CriterioNombreRemitente("UNICEN");
		CriterioPeso criterioPeso = new CriterioPeso(30);
		
		EnvioCombo comboPostalDestino = new EnvioCombo(789, "Combo Destino Postal", criterioDestino);
		EnvioCombo comboPostalDestino1 = new EnvioCombo(987, "Combo Destino Postal", criterioDestino1);
		
		EnvioCombo comboEmpresarial = new EnvioCombo(654, "Combo Empresarial", criterioRemitente);
		
		comboPostalDestino.agregarEnvio(carta);
		comboPostalDestino.agregarEnvio(paquete);
		
		comboPostalDestino1.agregarEnvio(carta);
		comboPostalDestino1.agregarEnvio(carta1);
				
		comboEmpresarial.agregarEnvio(paquete1);
		comboEmpresarial.agregarEnvio(carta);
		
		System.out.println(comboPostalDestino);
		System.out.println(comboPostalDestino1);
		System.out.println(comboEmpresarial);
		
		System.out.println("\nLista máximo 30gr: "+comboPostalDestino.listaConCriterio(criterioPeso));
	}

}
