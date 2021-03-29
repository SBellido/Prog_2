package tp9_Aseguradora;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SeguroTemporal extends SeguroColectivo {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	public SeguroTemporal(double descuento, LocalDate fechaInicio, LocalDate fechaFin) {
		super(descuento);
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;		
	}

	
	public boolean estaVigente() {
		LocalDate hoy = LocalDate.now();
		return (hoy.isAfter(fechaInicio) && hoy.isBefore(fechaFin));		
	}
	
	@Override
	public List<ElementoSeguro> listarSeguros(Criterio criterio) {
		List<ElementoSeguro> polizasCumplen = new ArrayList<>();
		if (this.estaVigente()) {
			polizasCumplen = super.listarSeguros(criterio);
			return polizasCumplen;
		}
		return polizasCumplen;
	}
	
	@Override
	public double getPrecio() {
		double precioFinal = 0;
		if (this.estaVigente())
			precioFinal = super.getPrecio();
		return precioFinal;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nFecha inicio: " + this.getFechaInicio() + 
				"\nFecha fin: " + this.getFechaFin(); 
	}


	public LocalDate getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public LocalDate getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	

}
