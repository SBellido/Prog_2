package tp9_SistemaComunicados;

public class CriterioPalabra extends Criterio {
	private String palabraBuscada;
	
	public CriterioPalabra(String palabraBuscada) {
		this.palabraBuscada = palabraBuscada;
	}

	@Override
	protected boolean cumple(Notificacion notificacion) {
		return notificacion.contienePalabra(this.palabraBuscada);
	}

}
