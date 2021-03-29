package tp9_Aseguradora;

public class CriterioAtributoDinamico implements Criterio {
	private AtributoDinamico atributo;
	
	public CriterioAtributoDinamico(AtributoDinamico atributo) {
		this.atributo = atributo;
	}

	@Override
	public boolean cumple(ElementoSeguro poliza) {
		return poliza.tieneAtributo(atributo);
	}

	
}
