 package tp9_EnvioPostal;

import java.util.ArrayList;
import java.util.List;


public class EnvioCombo extends ElementoEnvio {
	private String nombre;
	private List<ElementoEnvio> envios;
	private Criterio criterio;
	
	public EnvioCombo(int numTracking, String nombre, Criterio criterio) {
		super(numTracking);
		this.nombre = nombre;
		this.criterio = criterio;
		this.envios = new ArrayList<>();
	}
	

	@Override
	public List<ElementoEnvio> listaConCriterio(Criterio criterio) {
		List<ElementoEnvio> enviosEncontrados = new ArrayList<>();
		for (ElementoEnvio elementoEnvio : this.envios) {
			if (criterio.cumple(elementoEnvio))
				enviosEncontrados.addAll(elementoEnvio.listaConCriterio(criterio));
			return enviosEncontrados;
		}
		return enviosEncontrados;
	}


	
	@Override
	protected String getNombreRemitente() {
		return this.envios.get(0).getNombreRemitente();
	}
	
	
	@Override
	protected String getCiudadDestino() {	
		return this.envios.get(0).getCiudadDestino();
	}
	
	
	@Override
	protected String getCiudadOrigen() {	
		return this.envios.get(0).getCiudadOrigen();
	}
	
	
	@Override
	protected String getNombreCalleDestino() {	
		return this.envios.get(0).getNombreCalleDestino();
	}

	
	public void agregarEnvio(ElementoEnvio envio) {
		if (criterio.cumple(envio)) {
			envio.setNumTracking(this.numTracking);
			this.envios.add(envio);			
		}
	}
	
	
	
	@Override
	protected double getPeso() {
		double pesoTotal = 0;
		for (ElementoEnvio elementoEnvio : this.envios)
			pesoTotal += elementoEnvio.getPeso();
		return pesoTotal;
	}


	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}
	
	
	@Override 
	public String toString() {
		return ("\n----------------------------\n"+ 
				"\nCombo: " + this.getNombre() +  
				"\nEnvíos: " + this.getEnvios()  + 
				"\nNúmero tracking: "+this.getNumTracking()) + 
				"\nPeso total: " + this.getPeso();
	}
	
	
	public List<ElementoEnvio> getEnvios() {
		return new ArrayList<>(this.envios);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





}
