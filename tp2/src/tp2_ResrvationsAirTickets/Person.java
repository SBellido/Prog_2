package tp2_ResrvationsAirTickets;

import java.time.LocalDate;
import java.util.List;

public class Person {
	private String name;
	private String dni;
	private int day;
	private int month;
	private int year;
	private LocalDate birth;
	private List<Reservation> reservation;

	public Person(String name, String dni, LocalDate birth, List<Reservation> reservation) {
		this.name = name;
		this.dni = dni;
		this.birth = birth;
		this.setReservation(reservation);
	}
	
	public Person() {
		this.setName(name);
		this.setDni(dni);
		this.setBirth(birth);
	}
	
	public Reservation requestReservation
		(String destination,
		 LocalDate startRange,
		 LocalDate endRange,
		 String category,
		 String subSection) {
		
		Reservation reservation = new Reservation();
		return reservation;
		
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String datos = "--------------------------------------------------"
				+ "\nNombre y Apellido:" + this.getName() + "\nDNI: " + this.getDni()
				+ "\nFecha de nacimiento: " + this.getBirth() + "\nReservas: " + this.getReservation()
				+ "\n--------------------------------------------------";
		
		return datos;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}
	
	
	
}

