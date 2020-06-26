package testDataObjects.city.districts.buildings;

public abstract class ResidentialBuilding {
	public String name;
	public int inhabitantCount;
	
	public ResidentialBuilding() {
		
	}
	
	public ResidentialBuilding(String name, int inhabitantCount) {
		this.name = name;
		this.inhabitantCount = inhabitantCount;
	}
}
