package RentalSystem;

import java.time.LocalDate;

public abstract class ItemForRent {
	
	public ItemForRent() {
	
	}

//	ITEM, ALQUILATE
	public abstract boolean rent(Client client, LocalDate rentalDay, LocalDate returnDay);
	
}
