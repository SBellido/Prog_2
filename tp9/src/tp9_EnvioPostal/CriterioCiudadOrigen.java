package tp9_EnvioPostal;

public class CriterioCiudadOrigen extends Criterio {
	private String ciudad;
	
	public CriterioCiudadOrigen(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	protected boolean cumple(ElementoEnvio envio) {
		return envio.getCiudadOrigen().equals(this.ciudad);		
	}

}
