package tp7_nursery;

import java.util.ArrayList;
import java.util.List;

public class Plant {
	private static int id;
	private int numberId;
	private String scientificName;
	private List<String> commonNames; 
	private String topClassification; 
	private String family; 
	private String classPlant; 
	private boolean houseplant; 
	private int irrigation;
	private int sun;

	public Plant(String scientificName, String topClassification, String family, String classPlant, boolean houseplant,
			int irrigation, int sun) {
		this.numberId = id++;
		this.scientificName = scientificName;
		this.commonNames = new ArrayList<>();
		this.topClassification = topClassification;
		this.family = family;
		this.classPlant = classPlant;
		this.houseplant = houseplant;
		this.irrigation = irrigation;
		this.sun = sun;
	}
	
	public boolean containsCommonName(String searchedCommonName) {
			return this.commonNames.contains(searchedCommonName);
	}
	
	@Override
	public String toString() {
		return "\n----------------------------------------------" +
				"\nPLANTA" + 
				"\nID: " + this.getNumberId() + 
				"\nNombre científico: " + this.getScientificName() + 
				"\nNombre vulgar: " + this.getCommonNames() + 
				"\nClasificación principal: " + this.getTopClassification() + 
				"\nFamilia: " + this.getFamily() + 
				"\nClase: " + this.getClassPlant() +
				"\nDe interior: " + this.isHouseplant() + 
				"\nRiego: " + this.getIrrigation() + 
				"\nSol: " + this.getSun();
	}


	@Override
	public boolean equals(Object obj) {
		try {
			Plant aux = (Plant) obj;
			return this.getNumberId() == aux.getNumberId();
		} catch (Exception e) {
			return false;
		}
	}
	
	
//	GETTERS & SETTERS	
	public String getScientificName() {
		return scientificName;
	}

	public int getNumberId() {
		return numberId;
	}
	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public String getTopClassification() {
		return topClassification;
	}

	public void setTopClassification(String topClassification) {
		this.topClassification = topClassification;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getClassPlant() {
		return classPlant;
	}

	public void setClassPlant(String classPlant) {
		this.classPlant = classPlant;
	}

	public boolean isHouseplant() {
		return houseplant;
	}

	public void setHouseplant(boolean houseplant) {
		this.houseplant = houseplant;
	}

	public int getIrrigation() {
		return irrigation;
	}

	public void setIrrigation(int irrigation) {
		this.irrigation = irrigation;
	}

	public int getSun() {
		return sun;
	}

	public void setSun(int sun) {
		this.sun = sun;
	}

	public List<String> getCommonNames() {
		return new ArrayList<>(this.commonNames);
	}

	
}
