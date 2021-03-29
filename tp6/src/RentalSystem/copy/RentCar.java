package RentalSystem.copy;
/*
Los coches s�lo pueden ser alquilados a un cliente por vez.
 */
public class RentCar extends RentItem {

	public RentCar() { }

	@Override
	public boolean meetsCondition(ItemForRent item) {
		CarForRent car = (CarForRent) item;
		return car.getClient() == null;
	}

}
