package tp9_EnvioPostal;

public abstract class Criterio {

	protected Criterio() {
		
	}
	
	protected abstract boolean cumple(ElementoEnvio envio);
	

}
