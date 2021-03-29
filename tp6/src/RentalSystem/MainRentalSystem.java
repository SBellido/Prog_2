package RentalSystem;

import java.time.LocalDate;

/*3. Sistema de Alquiler
Para evitar convertirse en un nuevo Blockbuster, un videoclub de barrio ha decidido
diversificarse e incorporar a su cartera de negocios el alquiler de autos. Para modernizarse,
abandonará los registros en papel e implementará un sistema unificado de alquiler. El sistema
debe permitir alquilar un determinado ítem a un cliente hasta una fecha determinada y llevar
control de los ítems alquilados a cada cliente. 

Las películas poseen información filmográfica
y la cantidad de copias que se dispone de la misma. De los vehículos, se registra marca, kms
y patente. Los vehículos pueden ser eléctricos, nafteros o diesel. Una película puede ser
alquilada si hay copias aún disponibles, mientras que los vehículos sólo pueden ser alquilados
a un cliente por vez.

Se debe proveer además la funcionalidad necesaria para permitir conocer quiénes son los
clientes que poseen alquileres vencidos*/

public class MainRentalSystem {

	public static void main(String[] args) {
		RentalSystem rentalSystem = new RentalSystem();
		Client client1 = new Client("Carlos Mata", null);
		Client client2 = new Client("Pedro Pérez", null);
		Client client3 = new Client("Federico García", null);
		Client client4 = new Client("Juan Carlos Gómez", null);
		CarForRent item1 = new CarForRent(null, "Honda", 2000.0, "AOX266", "Naftero");
		CarForRent item3 = new CarForRent(null, "Honda", 2000.0, "AOX266", "Naftero");
		FilmForRent item2 = new FilmForRent("La Caída", "Oliver Hirschbiegel", 2);
	
		
		rentalSystem.rentItem(item2, client1,  LocalDate.of(2020, 9, 1),LocalDate.of(2020, 9, 30));
		rentalSystem.rentItem(item2, client2,  LocalDate.of(2020, 9, 1),LocalDate.of(2021, 9, 30));
		rentalSystem.rentItem(item2, client3,  LocalDate.of(2020, 9, 1),LocalDate.of(2020, 9, 30));

		System.out.println(rentalSystem);
		System.out.println(rentalSystem.getDebtor());
	}

}
