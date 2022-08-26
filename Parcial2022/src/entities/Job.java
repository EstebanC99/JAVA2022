package entities;

public abstract class Job {

	private int id;
	private String name;
	private String description;
	private double estimatedHours;
	private double insuranceCost;
	private WorkType workType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getEstimatedHours() {
		return estimatedHours;
	}
	public void setEstimatedHours(double estimatedHours) {
		this.estimatedHours = estimatedHours;
	}
	public double getInsuranceCost() {
		return insuranceCost;
	}
	public void setInsuranceCost(double insurancePercentage) {
		this.insuranceCost = insurancePercentage;
	}
	public WorkType getWorkType() {
		return workType;
	}
	public void setWorkType(WorkType workType) {
		this.workType = workType;
	}
	
	public double getOveralJob() {
		return this.getJobCost() + this.getInsuranceCost();
	};
	
	protected abstract double getJobCost();
}
