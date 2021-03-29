 package tp9_SistemaComunicados;

public class CriterioRemitente extends Criterio {
	private Empleado remitente;
	
	public CriterioRemitente(Empleado remitente) {
		this.remitente = remitente;
	}

	@Override
	protected boolean cumple(Notificacion notificacion) {
		return notificacion.getRemitente().equals(this.remitente);
	}

}
