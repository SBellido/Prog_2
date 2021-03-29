package RentalSystem.copy;

/*
 * 3. Sistema de Alquiler
Para evitar convertirse en un nuevo Blockbuster, un videoclub de barrio ha decidido
diversificarse e incorporar a su cartera de negocios el alquiler de autos. Para modernizarse,
abandonar� los registros en papel e implementar� un sistema unificado de alquiler. El sistema
debe permitir alquilar un determinado �tem a un cliente hasta una fecha determinada y llevar
control de los �tems alquilados a cada cliente. 

Las pel�culas poseen informaci�n filmogr�fica
y la cantidad de copias que se dispone de la misma. De los veh�culos, se registra marca, kms
y patente. Los veh�culos pueden ser el�ctricos, nafteros o diesel. Una pel�cula puede ser
alquilada si hay copias a�n disponibles, mientras que los veh�culos s�lo pueden ser alquilados
a un cliente por vez.

Se debe proveer adem�s la funcionalidad necesaria para permitir conocer qui�nes son los
clientes que poseen alquileres vencidos
 */
public class MainRentalSystem {

	public static void main(String[] args) {
		Client client = new Client("Carlos Mata");
		ItemForRent item = new ItemForRent();
		System.out.println(item);


	}

}
