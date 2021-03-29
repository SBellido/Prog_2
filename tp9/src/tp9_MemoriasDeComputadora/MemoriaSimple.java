package tp9_MemoriasDeComputadora;

import java.util.List;

public class MemoriaSimple extends MemoriaAbs {
	private List<Integer> bytes;
	
	public MemoriaSimple(MemoriaCompuesta memoria) {
		super(memoria);
	}

	

	@Override
	protected MemoriaAbs obtenerUltimoAcceso() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected int cantidadAccesos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double tamanioMemoria() {
		return 1;
	}

	@Override
	protected int getTA() {
		return 0;
	}

}
