package tp8_CostConrtol;

import java.util.ArrayList;
import java.util.List;


public abstract class ElementExpense {
	protected String name;		
	protected double amount;
	private List<DinamicAttribute> attributes;
	
	protected ElementExpense(String name) {
		this.name = name;
		this.attributes = new ArrayList<>();
	}
	protected ElementExpense(String name, double amount) {
		this.name = name;
		this.amount = amount;
		this.attributes = new ArrayList<>();
	}

//	incluir un detalle pormenorizado sobre un gasto.	
	protected abstract List<String> enumExpenses();
	
//	El monto total del gasto es la suma de cada una de las partes que lo componen.
	protected abstract double getAmount();
	
//	1. El total de dinero gastado en una fecha dada.
//	2. El total de dinero que se gastó en el rubro: Alimentos.
//	5. El total de dinero que se  gastó en pintura, en una fecha dada.
	protected abstract double getTotalAmount(Criteria criteria);
	
//	3. Un listado con todos los gastos de una fecha dada.
//	4. Un listado con todos los gastos de calidad media que se hicieron.
//	6. Un listado de todos los gastos que superen los 1556 pesos.
	protected abstract List<ElementExpense> getElementExpense(Criteria criteria);
	
//	se puede caracterizar cualquiera de los tipos de gasto acorde a lo deseado por el
//	usuario, por ejemplo para gastos de pintura, color rojo, calidad media, metros 35.	
	protected void addDinamicAttribute(String name, Comparable value) {
		if (!this.containsAttribute(name))
			this.attributes.add(new DinamicAttribute(name, value));
		else this.updateAttribute(name, value);
	}
	
	public void updateAttribute(String name, Object value) {
		DinamicAttribute attribute = this.getAttribute(name);
		if (attribute != null)
			attribute.setValue(value);
	}	

	public DinamicAttribute getAttribute(String name) {
		for (DinamicAttribute dinamicAttribute : this.attributes) {
			if (dinamicAttribute.getName().equals(name)) 
				return dinamicAttribute;			
		}
		return null;
	}
	
	public boolean containsAttribute(String name) {
		DinamicAttribute attribute = this.getAttribute(name);
		return (attribute != null);
	}
	
	public boolean containsAttribute(DinamicAttribute attribute) {
		return this.attributes.contains(attribute);
	}

	@Override
	public boolean equals(Object obj) {
		try {
			ElementExpense aux = (ElementExpense) obj;
			return (this.getName().equals(aux.getName()));
		} catch (Exception e) {
			return false;
		}
	}
	
//	GETTERS & SETTERS
	protected String getName() {
		return this.name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
