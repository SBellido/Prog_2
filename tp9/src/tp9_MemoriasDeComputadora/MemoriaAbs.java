package tp9_MemoriasDeComputadora;

public abstract class MemoriaAbs {
	protected MemoriaCompuesta memoria;
		
	protected MemoriaAbs(MemoriaCompuesta memoria) {
		this.memoria = memoria;
		this.memoria.setMemoria(null);
	}
	
	protected abstract MemoriaAbs obtenerUltimoAcceso();
	protected abstract int cantidadAccesos();
	protected abstract double tamanioMemoria();
	protected abstract int getTA();
	
	protected MemoriaCompuesta getMemoria() {
		return memoria;
	}

	protected void setMemoria(MemoriaCompuesta memoria) {
		this.memoria = memoria;
	}
	

}
