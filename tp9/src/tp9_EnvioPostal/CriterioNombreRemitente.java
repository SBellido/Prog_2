package tp9_EnvioPostal;

public class CriterioNombreRemitente extends Criterio {
	private String nombre;
	
	public CriterioNombreRemitente(String nombre) {
		this.nombre = nombre;
	}

	@Override
	protected boolean cumple(ElementoEnvio envio) {
		return envio.getNombreRemitente().equals(this.nombre);
	}

}
