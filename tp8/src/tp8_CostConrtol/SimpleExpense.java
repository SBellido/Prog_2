package tp8_CostConrtol;

import java.util.ArrayList;
import java.util.List;

public class SimpleExpense extends ElementExpense {

	public SimpleExpense(String name, double amount) {
		super(name, amount);
	}

	
//  detallar cómo se compone originalmente el gasto.
	@Override
	public List<String> enumExpenses() {
		List<String> expensesNames = new ArrayList<>();
		expensesNames.add(this.toString());
		return expensesNames;
	}

//	1. El total de dinero gastado en una fecha dada.
//	2. El total de dinero que se gastó en el rubro: Alimentos.
//	5. El total de dinero que se  gastó en pintura, en una fecha dada.
	@Override
	public double getTotalAmount(Criteria criteria) {
		if (criteria.meetsCondition(this))
			return this.getAmount();
		return 0;			
	}

//	3. Un listado con todos los gastos de una fecha dada.
//	4. Un listado con todos los gastos de calidad media que se hicieron.
//	6. Un listado de todos los gastos que superen los 1556 pesos.
	@Override
	public List<ElementExpense> getElementExpense(Criteria criteria) {
		List<ElementExpense> expenses = new ArrayList<>();
		if (criteria.meetsCondition(this))
			expenses.add(this);
		return expenses;
	}

	@Override
	public String toString() {
		return this.getName();
	}

//	El monto total del gasto es la suma de cada una de las partes que lo componen.
	@Override
	public double getAmount() {
		return this.amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}



}

