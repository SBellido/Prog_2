package tp9_EnvioPostal;

public class CriterioNombreCalle extends Criterio{
	private String nombreCalle;
	
	public CriterioNombreCalle(String nombreCalle) {
		this.nombreCalle = nombreCalle;
	}

	@Override
	protected boolean cumple(ElementoEnvio envio) {
		return envio.getNombreCalleDestino().equals(this.nombreCalle);	
	}

}
