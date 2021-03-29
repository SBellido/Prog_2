
package tp3.Electrodomestico;

public class Electrodomestico {
	final static int low = 45;
	final static int balanceMedia = 3;
	private String name;
	private String colour;
	private int consumption;
	private double price;
	private double weight;

	public Electrodomestico(String name) {
		this.name = name;
		this.colour = "Gris Plata";
		this.consumption = 10;
		this.price = 100;
		this.weight = 2;
	}

	public Electrodomestico() {
		this.setName(name);
		this.setColour(colour);
		this.setConsumption(consumption);
		this.setPrice(price);
		this.setWeight(weight);
	}

	public Electrodomestico(String name, String colour, int consumption, double price, double weight) {
		this.name = name;
		this.colour = colour;
		this.consumption = consumption;
		this.price = price;
		this.weight = weight;
	}

	public boolean lowConsumption() {
		int consumption = this.getConsumption();
		return consumption < low;
	}

	public double calculateBalance() {
		double balance = this.getPrice() / this.getWeight();
		return balance;
	}

	public boolean highEnd() {
		boolean isHighEnd;
		double highEnd = this.calculateBalance();
		if (highEnd > balanceMedia) {
			isHighEnd = true;
			return isHighEnd;
		} else {
			isHighEnd = false;
			return isHighEnd;
		}
	}

	
	@Override
	public String toString() {
		return "----------------------------------------------" +
				"\n Electrodomestico Nombre: " + this.getName() + 
				"\n Color: " + this.getColour() + "\n Consumo: " + this.getConsumption() + 
				"\n Precio: " + this.getPrice() + "\n Peso: " + this.getWeight() + "\n Alta Gama: " + this.highEnd() + 
				"\n Balance: " + this.calculateBalance() + "\n Bajo Consumo: " + this.lowConsumption() +
				"\n----------------------------------------------";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getConsumption() {
		return consumption;
	}

	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
