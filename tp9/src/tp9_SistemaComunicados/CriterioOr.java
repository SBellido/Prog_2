package tp9_SistemaComunicados;

public class CriterioOr extends Criterio {
	private Criterio criterio1, criterio2;
	
	public CriterioOr(Criterio criterio1, Criterio criterio2) {
		this.criterio1 = criterio1;
		this.criterio2 = criterio2;
	}

	@Override
	protected boolean cumple(Notificacion notificacion) {
		return this.criterio1.cumple(notificacion) || this.criterio2.cumple(notificacion);	
	}

}
