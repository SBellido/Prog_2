package tp9_SistemaComunicados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Notificacion {
	private Empleado remitente;
	private List<String> texto;
	private LocalDate fecha;
	
	public Notificacion(Empleado remitente, LocalDate fecha) {
		this.remitente = remitente;
		this.fecha = fecha;
		this.texto = new ArrayList<>();
	}

	public void enviarNotificacion(String mensaje, ElementoDestinatario destinatario) {
		 String[] mensajeEspaciado = mensaje.split(" ");
	     List<String> textoFinal = new ArrayList<String>(Arrays.asList(mensajeEspaciado));
	     this.texto = new ArrayList<>(textoFinal);
	     destinatario.recibirNotificacion(this);
 	}


	public int contarPalabras() {
		return this.texto.size();
	}
	
	public boolean contienePalabra(String palabra) {
		return this.texto.contains(palabra);
	}
	
	public boolean esRemintenteDeseado(Empleado remitenteDeseado) {
		return this.remitente.equals(remitenteDeseado);
	}
	
	
//	 GETTERS & SETTERS
	public Empleado getRemitente() {
		return remitente;
	}
	public void setRemitente(Empleado remitente) {
		this.remitente = remitente;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	
	
	
}