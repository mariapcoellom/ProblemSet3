package edu.monmouth.campusvehicle;

public class CampusVehicle {
	private String id;
	private String location;
	private boolean available;
	private Color color;
	private static final String DEFAULT_ID = "UNKNOWN";
	private static final String DEFAULT_LOCATION = "UNKNOWN";
	private static final boolean DEFAULT_AVAILABLE = true;
	
	public CampusVehicle(String id, String location, boolean available){
		this(id, location, available, Color.UNKNOWN);
		
	}
	public CampusVehicle() {
		this(DEFAULT_ID, DEFAULT_LOCATION, DEFAULT_AVAILABLE, Color.UNKNOWN);
		
	}
	public CampusVehicle(String id, String location, boolean available, Color color) {
		setId(id);
		setLocation(location);
		setAvailable(available);
		setColor(color);
	}
	public String getId() {
		return id;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
		}
	public void setId(String id) {
		if (id != null && // rejects null values
			id.length() >= 6 && // string with less than 4 characters
			id.length() <= 18 && // greater than 12 characters
			id.startsWith("MU")) { // string not starting with two letter "MU"
			
			this.id = id.toLowerCase();
		} else {
			this.id = DEFAULT_ID;
		}
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		if (location != null &&
			!location.isEmpty() &&
			(location.equalsIgnoreCase("Library") ||
			 location.equalsIgnoreCase("University Bluffs") ||
			 location.equalsIgnoreCase("Parking Lot") ||
			 location.equalsIgnoreCase("Spruce Hall") ||
			 location.equalsIgnoreCase("Laurel Hall"))) {
			
			this.location = location.toLowerCase();
			
		} else {
			this.location = DEFAULT_LOCATION;
		}
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public void checkOut() {
		if (available == true) {
			available = true;
		}
	}
	public void returnVehicle() {
		available = true;
	}

}
