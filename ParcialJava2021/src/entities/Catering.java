package entities;

import java.util.ArrayList;

public class Catering extends Event{

	private Catering() {
		super();
		this.menues = new ArrayList<>();
	}
	
	private Double fixedCost;
	
	private ArrayList<Menu> menues;

	public Double getFixedCost() {
		return fixedCost;
	}

	public void setFixedCost(Double fixedCost) {
		this.fixedCost = fixedCost;
	}

	public ArrayList<Menu> getMenues() {
		return menues;
	}

	public void setMenues(ArrayList<Menu> menues) {
		this.menues = menues;
	}
	
	public Double getOverallCost() {
		Double menuCost = (double) 0;
		Double serviceCost = (double) 0;
		
		for (Menu menu : menues) {
			menuCost += menu.getTotalCost();
		}
		
		for (Service service : services) {
			serviceCost += service.getCost();
		}
		
		return this.getFixedCost() + menuCost + serviceCost;
	}
	
}
