package tp8_CostConrtol;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

/* Proveer la funcionalidad necesaria para el siguiente tipo de gasto: la organización administra
un caso de gasto pendiente de pago. Dicho gasto puede ser cualquier tipo existente (un gasto
simple o un gasto detallado) o cualquier tipo de gasto que se agregue en un futuro, tiene un
porcentaje de actualización anual, la cantidad de días pendiente, si el mismo ya se pagó o está
pendiente, y el monto se calcula en base al gasto contenido más el porcentaje acorde a los
días pendiente de pago. Si ya se pagó el monto es un valor fijo, calculado al momento que se
informó el pago. Implementar la funcionalidad que permita informar el pago del gasto y fijar
el valor de dicho monto. */

public class PendingExpense extends ElementExpense {
	private boolean isPaid;
	private double annualUpdatePercentage;
	private LocalDate paymentDate;
	private ElementExpense elementExpense;
	
	public PendingExpense(String name, double amount, LocalDate paymentDate, ElementExpense elementExpense) {
		super(name, amount);
		this.paymentDate = paymentDate;
		this.elementExpense = elementExpense;
	}

	public void setPayed(){
        this.isPaid = true;
        this.setAmount(this.elementExpense.getAmount());
    }
	@Override
	protected List<String> enumExpenses() {	
		return this.elementExpense.enumExpenses();
	}

	@Override
	protected double getAmount() {
		return (this.elementExpense.getAmount() + 
				this.getAnnualUpdatePercentage() * this.getPendingDays());
	}

	@Override
	protected double getTotalAmount(Criteria criteria) {
		return this.elementExpense.getTotalAmount(criteria);
	}

	@Override
	protected List<ElementExpense> getElementExpense(Criteria criteria) {
		return this.elementExpense.getElementExpense(criteria);
	}
	
	public long getPendingDays() {
		long pendingDays = ChronoUnit.DAYS.between(
				this.getPaymentDate(), LocalDate.now());
		return pendingDays;
	}
	
	public boolean isPaid() {
		return this.isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	public double getAnnualUpdatePercentage() {
		return annualUpdatePercentage;
	}
	public void setAnnualUpdatePercentage(double annualUpdatePercentage) {
		this.annualUpdatePercentage = annualUpdatePercentage;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

}
