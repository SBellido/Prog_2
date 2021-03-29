package tp1_AgendaPersonal;

import java.util.List;

public class AgendaPersonal {
	private List<Reunion> reuniones;
	private List<Persona> contactos;
 
	public AgendaPersonal() {
		setReuniones(reuniones);
		setContactos(contactos);
	}
	
	public void registrarReunion(Reunion reunion) {
		
	}
	
	public List<Reunion> getReuniones() {
		return reuniones;
	}
	public void setReuniones(List<Reunion> reuniones) {
		this.reuniones = reuniones;
	}
	public List<Persona> getContactos() {
		return contactos;
	}
	public void setContactos(List<Persona> contactos) {
		this.contactos = contactos;
	}
	 
}
