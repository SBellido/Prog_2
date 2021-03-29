package tp9_Aseguradora;

public class CriterioAnd implements Criterio {
	private Criterio c1, c2;
	
	public CriterioAnd(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public boolean cumple(ElementoSeguro poliza) {
		return c1.cumple(poliza) && c2.cumple(poliza);
	}

}
