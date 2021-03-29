package tp2_ResrvationsAirTickets;

import java.util.ArrayList;

public class Airplane {
	private String modelo;
	private ArrayList<Flight> flights;
	
	public Airplane(String modelo, ArrayList<Flight> flights) {
		this.modelo = modelo;
		this.flights = new ArrayList<Flight>();
	}
	
	public Airplane() {
		this.setModelo(modelo);
		this.setFlights(flights);
	}
	
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public ArrayList<Flight> getFlights() {
		return flights;
	}

	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}
	
	
}
