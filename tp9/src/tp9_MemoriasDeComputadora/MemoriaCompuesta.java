package tp9_MemoriasDeComputadora;

import java.util.ArrayList;
import java.util.List;

public class MemoriaCompuesta extends MemoriaAbs {
	private final int TA;
	private List<MemoriaAbs> direccionesDeMemoria;
	
	public MemoriaCompuesta(MemoriaCompuesta memoria, int TA) {
		super(memoria);
		this.TA = TA;
		this.direccionesDeMemoria = new ArrayList<>();
	}


	protected MemoriaAbs leerPosicion(int posicion) {
		MemoriaAbs encontrado = this.direccionesDeMemoria.get(posicion);
		return encontrado;
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
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int getTA() {
		int tiempoTotal = 0;
		for (MemoriaAbs memoria : this.direccionesDeMemoria) 
			tiempoTotal += memoria.getTA();
		return tiempoTotal;
	}
	
	

}
