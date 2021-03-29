package tp9_EnvioPostal;

public class CriterioPeso extends Criterio {
	private double peso;
	
	public CriterioPeso(double peso) {
		this.peso = peso;
	}

	@Override
	protected boolean cumple(ElementoEnvio envio) {
		return envio.getPeso() <= this.peso;	
	}

	
}
