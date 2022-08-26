package entities;

public class QuantityRatedJob extends Job {
	
	private double quantity;

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	protected double getJobCost() {
		return this.getQuantity() * this.getWorkType().getQuantityRate();
	}
}
