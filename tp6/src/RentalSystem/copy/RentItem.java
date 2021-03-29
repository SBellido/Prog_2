package RentalSystem.copy;

public abstract class RentItem {
	
	public RentItem() {
		
	}

	public abstract boolean meetsCondition(ItemForRent item);	

}
