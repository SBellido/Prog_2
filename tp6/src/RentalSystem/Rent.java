package RentalSystem;

import java.time.LocalDate;

public class Rent {
	protected static int id;
	private int numberId;
	private LocalDate rentalDay;
	private LocalDate returnDay;
	private ItemForRent item;
	private Client client;
		
	public Rent() {
		this.numberId = id++;
	}
	
	public Rent(ItemForRent item, Client client, LocalDate rentalDay, LocalDate returnDay) {
		this.numberId = id++;
		this.item = item;
		this.client = client;
		this.rentalDay = rentalDay;
		this.returnDay = returnDay;
	}

	
//	ALQUILAR
	public void rent(ItemForRent item, Client client, LocalDate rentalDay, LocalDate returnDay) {
		if (item.rent(client, rentalDay, returnDay)) {
			this.setClient(client);
			this.setRentalDay(rentalDay);
			this.setReturnDay(returnDay);			
		}
	}
	
//	OBTENER CLIENTES MOROSOS	
	public Client getClientsDeptors() {
		Client client = this.getClient();
		Client deptor = null;
		if (client.getRent().isTheRentDue()) {
			deptor = client;
			return deptor;
		}
		return deptor;
	}
	
	
// 	¿SE VENCIÓ EL ALQUILER?
	public boolean isTheRentDue() {
		return this.getReturnDay().isBefore(LocalDate.now());
	}
	
	@Override
	public String toString() {
		return "\nITEM EN RENTA" + 
				"\nFecha inicio renta: " + this.getRentalDay() + 
				"\nFecha fin renta: " + this.getReturnDay() + 
				"\nRenta vencida: " + this.isTheRentDue();
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Rent aux = (Rent) obj;
			return this.getNumberId() == aux.getNumberId();
		} catch (Exception e) {
			return false;
		}
	}
	
//	GETTERS & SETTERS
		public LocalDate getRentalDay() {
			return this.rentalDay;
		}
		public void setRentalDay(LocalDate rentalDay) {
			this.rentalDay = rentalDay;
		}
		public LocalDate getReturnDay() {
			return this.returnDay;
		}
		public void setReturnDay(LocalDate returnDay) {
			this.returnDay = returnDay;
		}
		public int getNumberId() {
			return numberId;
		}
		public Client getClient() {
			return client;
		}
		public void setClient(Client client) {
			this.client = client;
		}	
		
}
