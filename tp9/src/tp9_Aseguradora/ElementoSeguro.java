package tp9_Aseguradora;

import java.util.List;

public interface ElementoSeguro {


	boolean tieneAtributo(AtributoDinamico atributo);
	List<ElementoSeguro> listarSeguros(Criterio citerio);
	double getPrecio();
	
	
}
