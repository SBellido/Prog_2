package RentalSystem.copy;

public class RentFilm extends RentItem {
	public final int OUTSTOCK = 0;

	public RentFilm() {

	}

	@Override
	public boolean meetsCondition(ItemForRent item) {
		FilmForRent film = (FilmForRent) item;
		int units = film.getUnits();
		if (units > OUTSTOCK) {
			film.setUnits(units - 1);
			return true;
		} else {
			return false;
		}
	}

}
