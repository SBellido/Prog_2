package tp9_Aseguradora;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SeguroColectivo implements ElementoSeguro {
	protected Set<ElementoSeguro> polizas;
	private double descuento;
	
	
	public SeguroColectivo(double descuento) {
		this.descuento = descuento;
		this.polizas = new HashSet<>();
	}

	
	protected double aplicarDescuento(double precio) {
		double descuento = this.descuento * precio;
		double resultado = precio - descuento;
		return resultado;
	}
	
	
	@Override
	public boolean tieneAtributo(AtributoDinamico atributo) {
		for (ElementoSeguro elementoSeguro : this.polizas) {
			if (elementoSeguro.tieneAtributo(atributo)) 
				return true;
		}
		return false;
	}
	

	@Override
	public List<ElementoSeguro> listarSeguros(Criterio criterio) {
		List<ElementoSeguro> polizasCumplen = new ArrayList<>();
		for (ElementoSeguro elementoSeguro : this.polizas) {
			if (criterio.cumple(elementoSeguro)) 
				polizasCumplen.addAll(elementoSeguro.listarSeguros(criterio));
			return polizasCumplen;
		}
		return polizasCumplen;
	}

	
	@Override
	public double getPrecio() {
		double precioTotal = 0;
		for (ElementoSeguro elementoSeguro : this.polizas) 
			precioTotal += elementoSeguro.getPrecio();			
		double precioFinal = this.aplicarDescuento(precioTotal);
		return precioFinal;
	}
	
	
	public String toString() {
		return "\nPolizas: " + this.polizas + 
				"\nPrecio total: " + this.getPrecio();				
	}
	public void agregarSeguro(ElementoSeguro poliza) {
		this.polizas.add(poliza);
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	
	
}
