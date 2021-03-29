package tp9_EnvioPostal;

public class Direccion {
	private String persona;
	private String ciudad;
	private String calle;
	private int numero;
	
	public Direccion(String persona, String ciudad, String calle, int numero) {
		this.persona = persona;
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
	}
	
	
//	GETTERS & SETTERS
	public String getPersona() {
		return persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
