package RentalSystem.copy;

public class RentAND extends RentItem {
	RentItem rentItem1, rentItem2;
	
	public RentAND() { }

	@Override
	public boolean meetsCondition(ItemForRent item) {
		return rentItem1.meetsCondition(item) && rentItem2.meetsCondition(item);
	}

}
