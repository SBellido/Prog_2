package RentalSystem.copy;

import java.time.LocalDate;

/*Las pel�culas poseen informaci�n filmogr�fica
y la cantidad de copias que se dispone de la misma.
Una pel�cula puede ser alquilada si hay copias a�n disponibles*/

public class FilmForRent extends ItemForRent {
	private String title;
	private String director;
	private int units;

	public FilmForRent() {
		super();
	}

	public FilmForRent(String title, String director, int units) {
		super();
		this.title = title;
		this.director = director;
		this.units = units;
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
				"\nT�tulo: " + this.getTitle() + 
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
