package RentalSystem.copy;

import java.time.LocalDate;

public class ItemForRent {
	private static int id;
	private int numberId;
	private Client client;
	private LocalDate rentalDay;
	private LocalDate returnDay;
	private boolean isRented;	

	public ItemForRent() {
		this.numberId = id++;
		this.isRented = false;
	}

//	ITEM, ALQUILATE
	public void rent(Client client, LocalDate rentDay, LocalDate returnDay) {
		this.setClient(client);
		this.setRentalDay(rentDay);
		this.setReturnDay(returnDay);
		this.setIsRented(true);
	}
	
// 	¿SE VENCIÓ EN ALQUILER?
	public boolean isTheRentDue() {
		return this.getReturnDay().isBefore(LocalDate.now());
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			ItemForRent aux = (ItemForRent) obj;
			return this.getNumberId() == aux.getNumberId();
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "\nITEM EN RENTA" + 
				"\nEstado de renta: " + this.isRented() +
				"\nCliente: " + this.getClient().getNumberDni() + 
				"\nFecha inicio renta: " + this.getRentalDay() + 
				"\nFecha fin renta: " + this.getReturnDay() + 
				"\nRenta vencida: " + this.isTheRentDue();
	}
	
	//GETTERS & SETTERS
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
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
	public boolean isRented() {
		return isRented;
	}
	public void setIsRented(boolean isRented) {
		this.isRented = isRented;
	}
	public int getNumberId() {
		return numberId;
	}
	
	

}
