/* 
	1  Reservas de Pasajes Aéreos 
Típicamente nuestros clientes son personas que desean 
viajar cómodamente y rápido por eso utilizan aviones como medio de transporte. 
En general, ellos no planifican con demasiada anticipación sus viajes y toman 
la decisión de tomar un vuelo debido a que amigos distantes les reclaman su visita, 
o lo deciden porque ya ha pasado un tiempo determinado desde la última vez que 
se tomaron un merecido descanso. Cuando una persona solicita una reserva no sabe 
en qué vuelo puede hacerlo. La persona especifica la ciudad de destino a la que 
quiere viajar, la fecha más temprana a partir de la cual quiere hacerlo y la fecha más 
tardía. Se lo consulta, por la clase (Primera, Turista, etc.) en la que quiere viajar, 
y luego por la subsección en la que se sentiría más cómodo (Pasillo /ventanilla). 
En base a dichos datos se determinan los vuelos en los que haya lugar disponible 
en base a sus intereses.  Se le pide confirmación por alguno de ellos. 
Si confirma alguno, se le solicitan sus datos, se asienta la reserva y 
se emite el pasaje correspondiente. Si a la persona no le satisficiera ninguno de 
los vuelos ofrecidos, o en caso de no poder determinar ningún vuelo acorde con sus 
intereses, se lo invita a pasar en otro momento por si surge alguna novedad.   
Consejo: Ver la existencia de diferente granularidad de objetos.
No modelar solo uno gigante 
Extra: ¿Existen similitudes con la agenda del ejercicio 1? 	

*/

package tp2_ResrvationsAirTickets;

import java.time.LocalDate;

public class mainBookingAirfare {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Airline qatar = new Airline("Qatar Airlines");
		LocalDate birthP1 =  LocalDate.of(1979, 12, 27);
		LocalDate birthP2 =  LocalDate.of(1990, 4, 8);
		LocalDate birthP3 =  LocalDate.of(2001, 12, 31);

		p1.setName("Sebastián Bellido");
		p1.setDni("27388144");
		p1.setBirth(birthP1);
		
		p2.setName("Marcos López");
		p2.setDni("51559279");
		p2.setBirth(birthP2);
		
		p3.setName("Jorge García");
		p3.setDni("28455777");
		p3.setBirth(birthP3);
		
		qatar.registerClient(p1);
		qatar.registerClient(p2);
		qatar.registerClient(p3);
		qatar.printClients();
		
	}

}
