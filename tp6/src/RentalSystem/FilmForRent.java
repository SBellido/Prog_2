package RentalSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*Las películas poseen información filmográfica
y la cantidad de copias que se dispone de la misma.
Una película puede ser alquilada si hay copias aún disponibles*/

public class FilmForRent extends ItemForRent {
	private final int OUTSTOCK = 0;
	private String title;
	private String director;
	private List<Client> clients;
	private int units;

	public FilmForRent() {
		super();
		this.clients = new ArrayList<>();
	}
	public FilmForRent(String title, String director, int units) {
		super();
		this.title = title;
		this.director = director;
		this.units = units;
		this.clients = new ArrayList<>();
	}
	public FilmForRent(String title, String director, int units, 
			LocalDate rentalDay, LocalDate returnDay) {
		super();
		this.title = title;
		this.director = director;
		this.units = units;
		this.clients = new ArrayList<>();
	}

	public List<Client> getClientsDeptors() { 
		List<Client> deptors = new ArrayList<>();
		for (Client client : this.clients) {
			if (client.getRent().isTheRentDue()) {
				deptors.add(client);
			}
		}
		return deptors;
	}
	
//	FILM, ALQUILATE
	@Override
	public boolean rent(Client client, LocalDate rentalDay, LocalDate returnDay) {
		if (this.getUnits() > OUTSTOCK) {
			this.clients.add(client);
			this.setUnits(this.getUnits() - 1);	
			return true;
		} else { return false; }		
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			FilmForRent aux = (FilmForRent) obj;
			return (this.getTitle().equals(aux.getTitle()) &&
					this.getDirector().equals(aux.getDirector()));
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\nFILM" + 
				"\nTítulo: " + this.getTitle() + 
				"\nDirector: " + this.getDirector() + 
				"\nUnidades disponibles: " + this.getUnits();
	}


// GETTERS & SETTERS
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}


}
