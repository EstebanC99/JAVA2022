package entities;

import java.util.ArrayList;

public class Client {

	public Client() {
		this.events = new ArrayList<>();
	}
	
	private String firstName;
	
	private String lastName;

	private ArrayList<Event> events;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<Event> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}
	
	public Double getEventsBill() {
		Double eventsBill = (double) 0;
		
		for (Event event : events) {
			eventsBill += event.getOverallCost();
		}
		
		return eventsBill;
	}
}
