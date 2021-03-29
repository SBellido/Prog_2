package RentalSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
	private List<Rent> rents;
	
	public RentalSystem() {
		this.rents = new ArrayList<>();
	}

	public void rentItem(ItemForRent item, Client client, LocalDate rentalDay, LocalDate returnDay) {
		if (item.rent(client, rentalDay, returnDay)) {
			Rent rent = new Rent(item, client, rentalDay, returnDay);
			client.setRent(rent);
			this.addRent(rent);
		}
	}
	
	public List<Client> getDebtor() {
		List<Client> debtors = new ArrayList<>();
		for (Rent rent : this.rents)
			if (rent.isTheRentDue())		
			debtors.add(rent.getClient());
		return debtors;
	}
	
	public boolean containsRent(Rent rent) {
		return this.rents.contains(rent);
	}
	
	public void addRent(Rent rent) {
		if (!containsRent(rent))
			this.rents.add(rent);
	}
	
	public List<Rent> getRent() {
		return new ArrayList<>(this.rents);
	}

	@Override
	public String toString() {
		return "\nALQUILERES" + this.getRent();
	}
	
	
}
