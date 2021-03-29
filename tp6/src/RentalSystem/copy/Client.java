package RentalSystem.copy;

public class Client {
	private static int dni;
	private int numberDni;
	private String name;

	public Client() { }
	public Client(String name) {
		this.name = name;
		this.numberDni = dni++;
	}

	
//	GETTERS & SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberDni() {
		return numberDni;
	}
	
	

}
