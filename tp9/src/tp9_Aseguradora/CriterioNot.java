package tp9_Aseguradora;

public class CriterioNot implements Criterio {
	private Criterio criterio;
	
	public CriterioNot(Criterio criterio) {
		this.criterio = criterio;
	}

	@Override
	public boolean cumple(ElementoSeguro poliza) {
		return !this.criterio.cumple(poliza);
	}
	

}
