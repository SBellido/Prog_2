package RentalSystem.copy;


/*De los vehículos, se registra marca, kms
y patente. Los vehículos pueden ser eléctricos, nafteros o diesel.
Los vehículos sólo pueden ser alquilados a un cliente por vez.*/

public class CarForRent extends ItemForRent {
	private String brand;
	private double kms;
	private String patent;
	private String motor;

	public CarForRent(String brand, double kms, String patent, String motor) {
		super();
		this.brand = brand;
		this.kms = kms;
		this.patent = patent;
		this.setMotor(motor);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		try {
			CarForRent aux = (CarForRent) obj;
			return (this.getReturnDay().equals(aux.getBrand()) &&
					this.getMotor().equals(aux.getMotor()) &&
					this.getPatent().equals(aux.getPatent()));
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nCHOCHE" + 
				"\nMarca: " + this.getBrand() + 
				"Km: " + this.getKms() + 
				"Patente: " + this.getPatent() + 
				"Motor: " + this.getMotor();
	}

	//	GETTERS & SETTERS
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
