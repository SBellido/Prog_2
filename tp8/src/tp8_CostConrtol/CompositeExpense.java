package tp8_CostConrtol;

import java.util.ArrayList;
import java.util.List;


public class CompositeExpense extends ElementExpense {
	private List<ElementExpense> expenses;
	
	public CompositeExpense(String name) {
		super(name);
		this.expenses = new ArrayList<>();
	}

//	El monto total del gasto es la suma de cada una de las partes que lo componen.
	@Override
	public double getAmount() {
		double total = 0;
		for (ElementExpense elementExpense : this.expenses)
			total += elementExpense.getAmount();
		return total;
	}
	
//	1. El total de dinero gastado en una fecha dada.
//	2. El total de dinero que se gastó en el rubro: Alimentos.
//	5. El total de dinero que se  gastó en pintura, en una fecha dada.
	@Override
	protected double getTotalAmount(Criteria criteria) {
		double total = 0;
		for (ElementExpense elementExpense : this.expenses) {
			if (criteria.meetsCondition(elementExpense))
				total += elementExpense.getTotalAmount(criteria);	
		}
		return total;
	}
	
//	3. Un listado con todos los gastos de una fecha dada.
//	4. Un listado con todos los gastos de calidad media que se hicieron.
//	6. Un listado de todos los gastos que superen los 1556 pesos.
	@Override
	public List<ElementExpense> getElementExpense(Criteria criteria) {
		List<ElementExpense> expensesFound = new ArrayList<>();
		if (criteria.meetsCondition(this))
			expensesFound.add(this);
		for (ElementExpense elementExpense : this.expenses) {
			if (criteria.meetsCondition(elementExpense))
				expensesFound.addAll(elementExpense.getElementExpense(criteria));
		}			
		return expensesFound;
	}
	
//	incluir un detalle pormenorizado sobre un gasto.
	@Override
	public List<String> enumExpenses() {
		List<String> expensesNames = new ArrayList<>();
		expensesNames.add(this.toString());
		for (ElementExpense expense : this.expenses) {
			expensesNames.addAll(expense.enumExpenses());
		}
		return expensesNames;
	}

	public void addExpense(ElementExpense expense) {
		if (!containsExpense(expense))
			this.expenses.add(expense);
	}
	public boolean containsExpense(ElementExpense expense) {
		return this.expenses.contains(expense);
	}

	@Override
	public String toString() {
		return "\nGASTO COMPUESTO: " + this.getName() + "\n";
	}


}
