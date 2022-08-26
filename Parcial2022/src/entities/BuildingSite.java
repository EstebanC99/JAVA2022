package entities;

import java.util.LinkedList;

public class BuildingSite {

	public BuildingSite() {
		this.jobs = new LinkedList<>();
	}
	
	private int id;
	private String address;
	private LinkedList<Job> jobs;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void addJob(Job job) {
		this.jobs.add(job);
	}
	
	public LinkedList<Job> getAllJobs(){
		return this.jobs;
	}
	
	public double getOveralBudget() {
		double overalBudget = (double) 0;
		
		for (Job job : this.jobs) {
			overalBudget += job.getOveralJob();
		}
		
		return overalBudget;
	}
	
}
