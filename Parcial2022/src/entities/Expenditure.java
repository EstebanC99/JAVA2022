package entities;

import java.util.Date;

public class Expenditure {

	private boolean reimbursable;
	private double amount;
	private Date date;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isReimbursable() {
		return this.reimbursable;
	}
	public void setReimbursable(boolean reimbursable) {
		this.reimbursable = reimbursable;
	}
	
	public double getReimbursableCost(double reimbursablePorcentage) {
		if (this.isReimbursable()) {
			return this.getAmount() * (reimbursablePorcentage / 100); 
		}
		
		return (double) 0;
	}
}
