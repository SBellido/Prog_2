package tp8_fileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class ElementFileSystem {
	protected String name;
	protected LocalDate creationDate;
	protected LocalDate modificationDate;
	protected Folder father;
	
	protected ElementFileSystem(String name) { 
		this.name = name;
		this.creationDate = LocalDate.now();
		this.modificationDate = LocalDate.now();
		this.father = null;
	}

	public abstract double getSize();	
	
	// preguntar
	public List<ElementFileSystem> search(Comparator<ElementFileSystem> comparator, Criteria criteria) {
		List<ElementFileSystem> found = new ArrayList<>();
		if (criteria.meetsCondition(this)) 
			found.add(this);		
		return found;
	}	

	// preguntar
	public boolean containsElement(ElementFileSystem searchedElement) {
		return (searchedElement.equals(this));
	}	
	
	public boolean haveFather() {
		return this.father != null;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			ElementFileSystem aux = (ElementFileSystem) obj;
			return (this.getName().equals(aux.getName()) &&
					this.getFather().equals(aux.getFather()));
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
@Override
	public String toString() {
		return this.getName();
	}

	// 	GETTERS & SETTERS
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
		this.setModificationDate();
	}
	public LocalDate getModificationDate() {
		return this.modificationDate;
	}
	public void setModificationDate() {
		this.modificationDate = LocalDate.now();
	}
	public LocalDate getCreationDate() {
		return this.creationDate;
	}
	public Folder getFather() {
		return this.father;
	}
	public void setFather(Folder father) {
		this.father = father;
	}

	
	
}
