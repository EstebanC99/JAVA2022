package entities;

public class Show extends Event {
	
	private String type;
	
	private String name;
	
	private Double durationHs;
	
	private Equipment equipment;
	
	private Artist artist;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDurationHs() {
		return durationHs;
	}

	public void setDurationHs(Double durationHs) {
		this.durationHs = durationHs;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	public Double getOverallCost() {
		return this.equipment.getCost() + (this.artist.getHourlyCost() * this.getDurationHs());
	}
}
