package tp9_SistemaComunicados;

import java.util.List;
import java.util.Set;

public abstract class ElementoDestinatario {
	protected String nombre;
	
	protected ElementoDestinatario(String nombre) {
		this.nombre = nombre;
	}

	protected abstract void recibirNotificacion(Notificacion notificacion);
	protected abstract int contarEmpleados();
	protected abstract List<ElementoDestinatario> listarPorCriterio(Criterio criterio);
	protected abstract Set<Empleado> listarEmpleados();
	protected abstract int contarNotificaciones();
	
	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			ElementoDestinatario aux = (ElementoDestinatario) obj;
			return this.getNombre().equals(aux.getNombre());
		} catch (Exception e) {
			return false;
		}
	}
	
	
}
