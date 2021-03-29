package RentalSystem;

public class Client {
	private static int dni;
	private int numberDni;
	private String name;
	private Rent rent;
	
	public Client() { }
	public Client(String name, Rent rent) {
		this.name = name;
		this.numberDni = dni++;
		this.rent = rent;
	}

	
	
//	GETTERS & SETTERS
	
	@Override
	public String toString() {
		return "\nCLIENTE" + 
				"\nNombre: " + this.getName() + 
				"\nDni: " + this.getNumberDni() + 
				"\nAlquiler: " + this.getRent();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRent(Rent rent) {
		this.rent = rent;
	}

	public Rent getRent() {
		return rent;
	}
	public int getNumberDni() {
		return numberDni;
	}
	
	

}
