package entities;

import java.util.LinkedList;

public class TravelLogic {
	
	public double getReimbursement(LinkedList<Expenditure> expenditures, double reimbursementPorcentage) {
		double totalReimbursement = (double) 0;
		
		for (Expenditure expenditure : expenditures) {
			totalReimbursement += expenditure.getReimbursableCost(reimbursementPorcentage);
		}
		
		return totalReimbursement;
	}
}
