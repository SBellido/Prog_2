package tp2_ResrvationsAirTickets;

import java.util.ArrayList;

public class Flight {
	private String flightNumber;
	private ArrayList<Reservation> reservations;

	public Flight(String flightNumber, ArrayList<Reservation> reservations) {
		this.flightNumber = flightNumber;
		this.reservations = reservations;
	}
	
	public Flight() {
		this.setFlightNumber(flightNumber);
		this.setReservations(reservations);
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}
}
