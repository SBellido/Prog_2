package tp8_Christmas;

import java.util.ArrayList;
import java.util.List;

public class LettersDepositComposite implements DepositElement {
	private String name;
	private List<DepositElement> deposits;

	public LettersDepositComposite(String name) {
		this.name = name;
		this.deposits = new ArrayList<>();
	}

//	1. Dado un buzón, provincia o país, conocer el porcentaje 
//	de cartas recibidas que piden un determinado regalo.
	@Override
	public double percentageLetters(String present) {
		double result = 0;
		int count = 0;
		for (DepositElement depositElement : this.deposits) {
			result += depositElement.percentageLetters(present);
			count++;
		}
		return (result / count);
	}

//	2. Dado un buzón, provincia o país, conocer la cantidad de 
//	cartas recibidas que piden un determinado regalo.
	@Override
	public int countLetters(String present) {
		int total = 0;
		for (DepositElement depositElement : this.deposits)
			total += depositElement.countLetters(present);
		return total;
	}
	
//	3. Dado un buzón, provincia o país, conocer 
//	la cantidad de niños malos que enviaron una carta. 
	@Override
	public int countBadKids() {
		int total = 0;
		for (DepositElement depositElement : this.deposits) {
			total += depositElement.countBadKids();
		}
		return total;
	}

//	4. Dado un buzón, provincia o país, conocer 
//	la cantidad de total de cartas recibidas.
	public int countLetters() {
		int count = 0;
		for (DepositElement depositElement : this.deposits) 
			count += depositElement.countLetters();
		return count;
	}
	
/*Los buzones se encuentran distribuidos en diferentes barrios, que a su vez se
agrupan por localidad, provincia o estado y país. Adicionalmente, puede haber
buzones especiales que no pertenezcan a un barrio, sino a la localidad,
provincia o país directamente (por ejemplo en la embajada de un país en otro).*/
	public void addDeposit(DepositElement deposit) {
		if (!this.containsLetterDeposit(deposit))
			this.deposits.add(deposit);
	}

	public boolean containsLetterDeposit(DepositElement deposit) {
		return this.deposits.contains(deposit);
	}

	@Override
	public String toString() {
		return "\nDepósito compuesto: " + this.getName() + 
				"\n" + this.deposits;
	}

	// GETTERS & SETTERS
	public String getName() {
		return this.name;
	}

}
