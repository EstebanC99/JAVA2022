package logic;

import java.util.LinkedList;

import entities.BillItem;

public class FacturarLogic {

	public Double getTotal(LinkedList<BillItem> items, boolean includeTax) {
		Double total = (double) 0;
		
		for (BillItem item : items) {
			total += item.getUnitPrice() * item.getQuantity();
		}
		
		if (includeTax) {
			total += total * 0.21;
		}
		
		return total;
	}
}
