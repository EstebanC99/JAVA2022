package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Event {
	
	protected Event() {
		this.services = new ArrayList<>();
	}
	
	protected LocalDateTime eventDate;
	
	protected String location;
	
	protected Client client;
	
	protected ArrayList<Service> services;

	public LocalDateTime getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDateTime eventDate) {
		this.eventDate = eventDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<Service> getServices() {
		return services;
	}

	public void setServices(ArrayList<Service> services) {
		this.services = services;
	}

	public abstract Double getOverallCost();
	
}
