package tp8_CostConrtol;


public class DinamicAttribute implements Comparable<DinamicAttribute> {
	private String name;
	private Comparable value;
	
	public DinamicAttribute() {}
	public DinamicAttribute(String name, Object value) {
		this.name = name;
		this.value = (Comparable) value;
	}
	
	@Override
	public int compareTo(DinamicAttribute attributo) {
		return this.value.compareTo(attributo.getValue());
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			DinamicAttribute aux = (DinamicAttribute) obj; 
			return (this.getName().equals(aux.getName()) &&
					this.value.compareTo(aux.getValue()) == 0);
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "\nNombre: " + this.getName() + 
				"\nValor: " + this.getValue();
	}
	
	//	GETTERS & SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Comparable getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = (Comparable) value;
	}
	

	
}
