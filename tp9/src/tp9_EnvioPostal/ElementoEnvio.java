package tp9_EnvioPostal;

import java.util.List;

public abstract class ElementoEnvio {	
	protected int numTracking;
	
	protected ElementoEnvio(int numTracking) {
		this.numTracking = numTracking;	
	}
	
	protected abstract double getPeso();
	protected abstract String getCiudadDestino();
	protected abstract String getNombreCalleDestino();
	protected abstract String getNombreRemitente();
	protected abstract String getCiudadOrigen();
	protected abstract List<ElementoEnvio> listaConCriterio(Criterio criterio);
	
	
//	GETTERS & SETTERS
	protected int getNumTracking() {
		return this.numTracking;
	}
	protected void setNumTracking(int numTracking) {
		this.numTracking = numTracking;
	}
	



}
