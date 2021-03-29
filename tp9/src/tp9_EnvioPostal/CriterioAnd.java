package tp9_EnvioPostal;

public class CriterioAnd extends Criterio {
	Criterio c1, c2;
	
	public CriterioAnd(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	protected boolean cumple(ElementoEnvio envio) {		
		return c1.cumple(envio) && c2.cumple(envio);
	}

}
