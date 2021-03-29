package RentalSystem.copy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
	private List<ItemForRent> items;
	private RentItem rentItem;
	
	public RentalSystem() {
		this.items = new ArrayList<>();
	}

	public void rentItem(ItemForRent item, Client client, LocalDate rentDay, LocalDate returnDay) {
		if (containsItem(item)) {
			if (rentItem.meetsCondition(item)) {
				item.rent(client, rentDay, returnDay);
			}		
		}
	}
	
	public List<Client> getDebtor() {
		Client deptor = new Client();
		List<Client> debtors = new ArrayList<>();
		for (ItemForRent item : this.items) {
			if (item.isTheRentDue()) {
				deptor = item.getClient();
				debtors.add(deptor);
			}
		}
		return debtors;
	}
	
	public boolean containsItem(ItemForRent item) {
		return this.items.contains(item);
	}
	public void addItem(ItemForRent item) {
		if (!containsItem(item)) {
			this.items.add(item);
		}
	}
	
	public List<ItemForRent> getItems() {
		return new ArrayList<>(this.items);
	}
	
	
}
