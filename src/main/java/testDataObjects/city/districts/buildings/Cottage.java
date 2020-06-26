package testDataObjects.city.districts.buildings;

public class Cottage extends ResidentialBuilding {
	public String cheeseName;
	
	public Cottage() {
		
	}
	
	public Cottage(String cheeseName, String name, int inhabitantCount) {
		super(name, inhabitantCount);
		this.cheeseName = cheeseName;
	}
}
