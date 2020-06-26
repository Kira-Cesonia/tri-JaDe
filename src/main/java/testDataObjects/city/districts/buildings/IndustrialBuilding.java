package testDataObjects.city.districts.buildings;

public abstract class IndustrialBuilding {
	public String name;
	public int yearlyCo2EmissionTons;
	
	public IndustrialBuilding() {
		
	}
	
	public IndustrialBuilding(String name, int yearlyCo2EmissionTons) {
		this.name = name;
		this.yearlyCo2EmissionTons = yearlyCo2EmissionTons;
	}
}
