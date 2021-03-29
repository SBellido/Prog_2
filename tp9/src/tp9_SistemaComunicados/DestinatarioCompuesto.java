package tp9_SistemaComunicados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class DestinatarioCompuesto extends ElementoDestinatario {
	private List<ElementoDestinatario> destinatarios;
	private Criterio criterio;
	
	public DestinatarioCompuesto(String nombre, Criterio criterio) {
		super(nombre);
		this.destinatarios = new ArrayList<>();
		this.criterio = criterio;
	}

	
	@Override
	protected void recibirNotificacion(Notificacion notificacion) {
		if (this.criterio.cumple(notificacion)) {
			for (ElementoDestinatario elementoDestinatario : this.destinatarios) {
				elementoDestinatario.recibirNotificacion(notificacion);				
			}
		}
	}
	
	
	@Override
	protected int contarEmpleados() {
		int contador = 0;
		for (ElementoDestinatario elementoDestinatario : this.destinatarios) 
			contador += elementoDestinatario.contarEmpleados();
		return contador;
	}
	
	
	@Override
	protected List<ElementoDestinatario> listarPorCriterio(Criterio criterio) {
		List<ElementoDestinatario> empleadosCumplen = new ArrayList<>();
		for (ElementoDestinatario elementoDestinatario : this.destinatarios) {
			if (!empleadosCumplen.contains(elementoDestinatario)) {
				empleadosCumplen.addAll(elementoDestinatario.listarPorCriterio(criterio));					
			}			
		}
		return empleadosCumplen;
	}

	
	@Override
	protected int contarNotificaciones() {
		int contador = 0;
		for (ElementoDestinatario elementoDestinatario : this.destinatarios) 
			contador += elementoDestinatario.contarNotificaciones();
		return contador;
	}
	

	@Override
	protected Set<Empleado> listarEmpleados() {
		Set<Empleado> empleados = new TreeSet<>(Collections.reverseOrder());
//		Set<Empleado> empleados = new TreeSet<>();
		for (ElementoDestinatario elementoDestinatario : this.destinatarios)
			empleados.addAll(elementoDestinatario.listarEmpleados());		
		return empleados;
	}

	
	public void agregarDestinatario(ElementoDestinatario destinatario) {
		if (!this.contieneDestinatario(destinatario))
			this.destinatarios.add(destinatario);			
	}
	
	public boolean contieneDestinatario(ElementoDestinatario destinatario) {
		return this.destinatarios.contains(destinatario);
	}
	
	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}
	
	
	public boolean equals(Object obj) {
		try {
			DestinatarioCompuesto aux = (DestinatarioCompuesto) obj;
			return (super.equals(aux) &&
					this.destinatarios.containsAll(aux.destinatarios));
		} catch (Exception e) {
			return false;
		}
	}

	public String toString() {
		return ("\nGRUPO: " + this.getNombre() + 
				"\nIntegrantes: " + this.destinatarios + 
				"\nCantidad de notificaciones: " + this.contarNotificaciones());
	}
}
