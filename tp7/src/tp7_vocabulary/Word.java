package tp7_vocabulary;


public class Word {
	private String name;
	private int quantity;
	
	public Word(String name) {
		this.name = name;
		this.quantity = 1;
	}

//	INCREMENTA CANTIDAD
	public void increaseQuantity() {
		this.quantity++;
	}
	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "\nPALABRA: " + this.getName() + 
				"\nCantidad encontrada: " + this.getQuantity();
	}
	
	

	
	
}
