package tp2_ResrvationsAirTickets;

import java.time.LocalDate;

public class Reservation {
	private String destination;
	private LocalDate date;
	private String category;
	private String subSection;
	private boolean isConfirm;
	private Person client;
	
	public Reservation(String destination, LocalDate date, String category, String subSection, Person cliente, boolean isConfirm) {	
		this.destination = destination;
		this.date = date;
		this.category = category;
		this.subSection = subSection;
		this.client = cliente;
		this.isConfirm = isConfirm;
	}
	
	public Reservation() {
		this.setDestination(destination);
		this.setDate(date);
		this.setCategory(category);
		this.setSubSection(subSection);
		this.setIsConfirm(isConfirm);
	}

	
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubSection() {
		return subSection;
	}

	public void setSubSection(String subSection) {
		this.subSection = subSection;
	}


	public boolean getIsConfirm() {
		return isConfirm;
	}

	public void setIsConfirm(boolean isConfirm) {
		this.isConfirm = isConfirm;
	}

	public Person getCliente() {
		return client;
	}

	public void setCliente(Person client) {
		this.client = client;
	}
	
	
}
