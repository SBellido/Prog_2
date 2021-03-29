package tp9_SistemaComunicados;

public abstract class Criterio {

	protected Criterio() {
		
	}

	protected abstract boolean cumple(Notificacion notificacion);
}
