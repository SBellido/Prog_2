 package tp9_SistemaComunicados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Empleado extends ElementoDestinatario implements Comparable<Empleado> {
	private String apellido;
	private static int legajo = 0;
	private int numLegajo;
	private int edad;
	private Set<Notificacion> notificaciones;
	
	public Empleado(String nombre, String apellido, int edad) {
		super(nombre);
		this.apellido = apellido;
		this.numLegajo = legajo++;
		this.edad = edad;
		this.notificaciones = new HashSet<>();
	}
	
	

	@Override
	public int compareTo(Empleado empleado) {
		return this.contarNotificaciones() - empleado.contarNotificaciones();
	}

	
	@Override
	public void recibirNotificacion(Notificacion notificacion) {
		this.notificaciones.add(notificacion);
	}
	
	@Override
	protected int contarEmpleados() {
		return 1;
	}

	@Override
	protected List<ElementoDestinatario> listarPorCriterio(Criterio criterio) {
		List<ElementoDestinatario> empleadoCumple = new ArrayList<>();
		for (Notificacion notificacion : this.notificaciones) {
			if (criterio.cumple(notificacion)) {
				empleadoCumple.add(this);
				return empleadoCumple; 
			}
		}
		return empleadoCumple; 
	}
	
	@Override
	protected int contarNotificaciones() {
		return this.notificaciones.size();
	}


	@Override
	protected Set<Empleado> listarEmpleados() {
		Set<Empleado> empleado = new HashSet<>();
		Empleado empleadoAux = new Empleado(this.getNombre(), this.getApellido(), this.getEdad());
		empleadoAux.notificaciones.addAll(this.notificaciones);
		empleado.add(empleadoAux);
		return empleado;
	}

	
	public void enviarNotificacion(String mensaje, ElementoDestinatario destinatario) {
		Notificacion notificación = new Notificacion(this, LocalDate.now());
		notificación.enviarNotificacion(mensaje, destinatario);
	}
	

	@Override
	public boolean equals(Object obj) {
		try {
			Empleado aux = (Empleado) obj;
			return (super.equals(aux) && 
					this.getApellido().equals(aux.getApellido()) &&
					this.getEdad() == aux.getEdad() && 
					this.getNumLegajo() == aux.getNumLegajo());
		} catch (Exception e) {
			return false;
		}
	}
	
	public String toString() {
		return ("\nNombre: " + this.getNombre() +  
				"\nApellido: " + this.getApellido() + 
				"\nEdad: " + this.getEdad() + 
				"\nLegajo: " + this.numLegajo + 
				"\nCantidad de notificaciones: " + this.contarNotificaciones());
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumLegajo() {
		return this.numLegajo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}



	

}
