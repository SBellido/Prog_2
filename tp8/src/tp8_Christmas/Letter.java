package tp8_Christmas;

import java.util.ArrayList;
import java.util.List;

public class Letter {
	private Kid sender;
	private List<String> presents;	
	private static String PRESENTBADBOY = "Trozo de carb�n";
	
	public Letter(Kid sender) {
		this.sender = sender;
		this.presents = new ArrayList<>();		
	}

//	Si un �ni�o malo� intenta depositar una carta en el buz�n, la lista de regalos 
//	correspondiente se vac�a y se reemplaza el regalo por un �Trozo de carb�n�.
	public void changePresent() {
		this.presents.removeAll(this.presents);
		this.presents.add(PRESENTBADBOY);
	}
	
	public boolean letterEmpty() {
		return this.presents.isEmpty();
	}
	public void addPresent(String present) {
		if (!this.containsPresent(present))
			this.presents.add(present);	
	}
	public boolean containsPresent(String present) {
		return this.presents.contains(present);
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Letter aux = (Letter) obj;
			return (this.getSender().equals(aux.getSender()) &&
					this.presents.containsAll(aux.presents));
		} catch (Exception e) {
			return false;
		}
	} 
	
	
	@Override
	public String toString() {
		return "\nCarta: " + 
				"\nRegalos:" + this.presents;
	}

	public Kid getSender() {
		return sender;
	}
}
