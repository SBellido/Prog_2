package tp9_Aseguradora;

public class AtributoDinamico {
	private String nombre;
	private Object valor;
	
	public AtributoDinamico(String nombre, Object valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	
//	GETTERS & SETTERS	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}

	
	@Override
	public boolean equals(Object obj) {
		try {
			AtributoDinamico aux = (AtributoDinamico) obj;
			return (this.getNombre().equals(aux.getNombre()) &&
					this.getValor().equals(aux.getValor()));
		} catch (Exception e) {
			return false;
		} 
	}
	
	public String toString() {
		return "\n" + this.getNombre() +" "+ this.getValor(); 
	}
	
	
}
