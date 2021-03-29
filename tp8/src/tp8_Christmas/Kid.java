package tp8_Christmas;

public class Kid {
	private String name;
	private static int dni;
	private int numberDni;
	private boolean goodKid;
	private LettersDepositSimple neighborhood;
	private Letter letter;
	
	public Kid(String name, boolean goodKid, LettersDepositSimple neighborhood) {
		this.name = name;
		this.numberDni = dni++;
		this.goodKid = goodKid;
		this.neighborhood = neighborhood;
		this.letter = new Letter(this);
	}

//	Cada niño deposita su carta en el buzón correspondiente a su barrio.
	public void depositLetter() {
		this.neighborhood.addLetter(this.letter);		
	}
	public void writeLetter(String present) {
		this.letter.addPresent(present);
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Kid aux = (Kid) obj;
			return (this.getNumberDni() == aux.getNumberDni());
		} catch (Exception e) {
			return false;
		}
	}
	
	
@Override
	public String toString() {
		return "\nNombre: " + this.getName() + 
				"\nDni: " + this.getNumberDni() + 
				"\n¿Es bueno? " + this.isGoodKid() +
				"\n" + this.getLetter().toString();
	}

	//	GETTERS & SETTERS
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGoodKid() {
		return this.goodKid;
	}
	public void setGoodKid(boolean goodKid) {
		this.goodKid = goodKid;
	}
	public int getNumberDni() {
		return numberDni;
	}
	public Letter getLetter() {
		return this.letter;
	}
	public LettersDepositSimple getNeighborhood() {
		return this.neighborhood;
	}
	
	
}
