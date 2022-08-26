package entities;

public class HourlyRatedJob extends Job {

	private Contratist constratist;
	
	public Contratist getConstratist() {
		return constratist;
	}
	public void setConstratist(Contratist constratist) {
		this.constratist = constratist;
	}

	protected double getJobCost() {
		return this.getConstratist().getHourlyRate() * this.getEstimatedHours();
	}
}
