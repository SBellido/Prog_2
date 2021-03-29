package tp9_EnvioPostal;

import java.util.ArrayList;
import java.util.List;

public class EnvioSimple extends ElementoEnvio {	
	private Direccion destinatario;
	private Direccion remitente;
	private boolean entregaDomicilio;
	private double peso;

	public EnvioSimple(int numTracking , Direccion destinatario, Direccion remitente,
			boolean entregaDomicilio, double peso) {
		super(numTracking);
		this.entregaDomicilio = entregaDomicilio;
		this.peso = peso;
		this.destinatario = destinatario;
		this.remitente = remitente;
	}

	@Override
	protected List<ElementoEnvio> listaConCriterio(Criterio criterio) {
		List<ElementoEnvio> enviosEncontrados = new ArrayList<>();
		if (criterio.cumple(this)) {
			enviosEncontrados.add(this);
			return enviosEncontrados;
		}
		return enviosEncontrados;
	}
	
	@Override
	protected double getPeso() {
		return this.peso;
	}	
	protected String getNombreCalleDestino() {	
		return this.destinatario.getCalle();
	}
	protected String getNombreRemitente() {
		return this.remitente.getPersona();
	}
	protected String getNombreDestinatario() {
		return this.destinatario.getPersona();
	}
	protected String getCiudadDestino() {
		return destinatario.getCiudad();
	}
	protected String getCiudadOrigen() {
		return remitente.getCiudad();
	}
	
	@Override
	public String toString() {
		return ("\n\nCiudad origen: " + this.getCiudadOrigen() + 
				"\nCiudad destino: " + this.getCiudadDestino() + 
				"\nPeso del envío: " + this.getPeso() + "grs" +
				"\nRemitente: " + this.getNombreRemitente() + 
				"\nDestinatario: " + this.getNombreDestinatario() + 
				"\nNúmero tracking: " + this.getNumTracking());
	}
	
	
//	GETTERS & SETTERS
	public boolean isEntregaDomicilio() {
		return entregaDomicilio;
	}
	public void setEntregaDomicilio(boolean entregaDomicilio) {
		this.entregaDomicilio = entregaDomicilio;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	protected void setDestinatario(Direccion destinatario) {
		this.destinatario = destinatario;
	}
	protected void setRemintente(Direccion remitente) {
		this.remitente = remitente;
	}



	
}
