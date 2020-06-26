package testDataObjects.city.districts.buildings;

public abstract class CommercialBuilding {
	public String name;
	public String sectorName;
	
	public CommercialBuilding() {
		
	}
	
	public CommercialBuilding(String name, String sectorName) {
		this.name = name;
		this.sectorName = sectorName;
	}
}
