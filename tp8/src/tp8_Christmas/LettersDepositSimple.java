package tp8_Christmas;

import java.util.ArrayList;
import java.util.List;

public class LettersDepositSimple implements DepositElement {
	private List<Letter> letters;
	private List<Integer> numbersDocuments;

	public LettersDepositSimple() {
		this.letters = new ArrayList<>();
		this.numbersDocuments = new ArrayList<>();
	}

	/*
	 * Cada buzón tiene asociado un conjunto de “niños buenos” que pueden dejar su
	 * carta en el mismo, identificados únicamente por su DNI. Los niños que no se
	 * encuentran en el listado de niños buenos de un buzón, se los considera “niños
	 * malos”. Si un “niño malo” intenta depositar una carta en el buzón, la lista
	 * de regalos correspondiente se vacía y se reemplaza el regalo por un “Trozo de
	 * carbón”. Si un niño deposita más de una carta en el buzón, solo se considera
	 * la primera. Nota: Todas las cartas recibidas se guardan en el buzón, aunque
	 * sean de “niños malos”
	 */
	public void addLetter(Letter letter) {
		if (!this.containsLetter(letter) && !letter.letterEmpty()) {
			if (letter.getSender().isGoodKid()) {
				this.letters.add(letter);
			} else {
				letter.changePresent();
				this.letters.add(letter);
			}
		}
	}

//	1. Dado un buzón, provincia o país, conocer el porcentaje 
//	de cartas recibidas que piden un determinado regalo.
	@Override
	public double percentageLetters(String present) {
		int total = countLetters(present);
		double result = ((double) total / (double) this.letters.size()) * 100;
		return result;
	}

//	2. Dado un buzón, provincia o país, conocer la cantidad de 
//	cartas recibidas que piden un determinado regalo.
	@Override
	public int countLetters(String present) {
		int total = 0;
		for (Letter letter : this.letters)
			if (letter.containsPresent(present))
				total++;
		return total;
	}
	
//	3. Dado un buzón, provincia o país, conocer 
//	la cantidad de niños malos que enviaron una carta. 
	@Override
	public int countBadKids() {
		int count = 0;
		for (Letter letter : this.letters) {
			if (!letter.getSender().isGoodKid())
				count++;
		}
		return count;
	}

//	4. Dado un buzón, provincia o país, conocer 
//	la cantidad de total de cartas recibidas.
	public int countLetters() {
		return this.letters.size();
	}
	
	public boolean containsLetter(Letter letter) {
		return this.letters.contains(letter);
	}

	public boolean containsDni(int dni) {
		return this.numbersDocuments.contains(dni);
	}

	public void addGoodKid(Kid kid) {
		if (kid.isGoodKid() && kid.getNeighborhood().equals(this)) {
			if (!this.containsDni(kid.getNumberDni()))
				this.numbersDocuments.add(kid.getNumberDni());
		}
	}

	public boolean equals(Object obj) {
		try {
			LettersDepositSimple aux = (LettersDepositSimple) obj;
			return (this.letters.containsAll(aux.letters) && 
					this.numbersDocuments.containsAll(aux.numbersDocuments));
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "\nContenido del buzón: " + this.letters + "\nDni de niños buenos: " + this.numbersDocuments;
	}

}
