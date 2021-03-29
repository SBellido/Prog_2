package tp9_SistemaComunicados;

public class CriterioCantidadPalabras extends Criterio {
	private int cantidad;
	
	public CriterioCantidadPalabras(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	protected boolean cumple(Notificacion notificacion) {
		return notificacion.contarPalabras() >= this.cantidad;
	}

}
