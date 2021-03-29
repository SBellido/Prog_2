package tp9_Aseguradora;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SeguroSimple implements ElementoSeguro {
	private Set<AtributoDinamico> atributos; 
	private double precio;
	
	public SeguroSimple(double precio) {
		this.precio = precio;
		this.atributos = new HashSet<>();
	}

	
	@Override
	public List<ElementoSeguro> listarSeguros(Criterio criterio) {
		List<ElementoSeguro> polizaCumple = new ArrayList<>();
		if (criterio.cumple(this)) {
			SeguroSimple copia = new SeguroSimple(this.getPrecio());
			copia.atributos.addAll(this.atributos);
			polizaCumple.add(copia);
			return polizaCumple;
		}
		return polizaCumple;
	}

	
	@Override
	public double getPrecio() {
		return this.precio;
	}
	
	
	@Override
	public boolean tieneAtributo(AtributoDinamico atributo) {
		return this.atributos.contains(atributo);
	}

	
	public void agregarAtributo(AtributoDinamico atributo) {
		this.atributos.add(atributo);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		try {
			SeguroSimple aux = (SeguroSimple) obj;
			return this.atributos.containsAll(aux.atributos);
		} catch (Exception e) {
			return false;
		}
	}
	
	public String toString() {
		return "\nPrecio: " + this.precio + 
				"\nAtributos: " + this.atributos;
	}


}
