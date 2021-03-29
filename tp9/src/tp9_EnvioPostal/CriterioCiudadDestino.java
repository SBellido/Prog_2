package tp9_EnvioPostal;

public class CriterioCiudadDestino extends Criterio {
	private String ciudad;
	
	public CriterioCiudadDestino(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	protected boolean cumple(ElementoEnvio envio) {
		return envio.getCiudadDestino().equals(this.ciudad);		
	}

}
