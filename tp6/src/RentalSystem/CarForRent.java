package RentalSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*De los vehículos, se registra marca, kms
y patente. Los vehículos pueden ser eléctricos, nafteros o diesel.
Los vehículos sólo pueden ser alquilados a un cliente por vez.*/

public class CarForRent extends ItemForRent {
	private String brand;
	private double kms;
	private String patent;
	private String motor;
	private Client client;

	public CarForRent(Client client, String brand, double kms, String patent, String motor) {
		super();
		this.brand = brand;
		this.kms = kms;
		this.patent = patent;
		this.setMotor(motor);
	}

	public List<Client> getClientsDeptors() { 
		List<Client> deptors = new ArrayList<>();
			deptors.add(this.client);
		return deptors;
	}

//	COCHE, ALQUILATE
	@Override
	public boolean rent(Client client, LocalDate rentalDay, LocalDate returnDay) {
		if (this.getClient() == null) {
			this.setClient(client);	
			return true;	
		} else { return false; }			
	}

	@Override
	public boolean equals(Object obj) {
		try {
			CarForRent aux = (CarForRent) obj;
			return (this.getBrand().equals(aux.getBrand()) && this.getMotor().equals(aux.getMotor())
					&& this.getPatent().equals(aux.getPatent()));
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\nCHOCHE" + "\nMarca: " + this.getBrand() + "Km: " + this.getKms() + "Patente: "
				+ this.getPatent() + "Motor: " + this.getMotor();
	}

	// GETTERS & SETTERS
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		motor.toUpperCase();
		if (motor == "DIESEL" || motor == "NAFTERO" || motor == "ELÉCTRICO") {
			this.motor = motor;
		}
	}

	public String getBrand() {
		return brand;
	}

	public String getPatent() {
		return patent;
	}

}
