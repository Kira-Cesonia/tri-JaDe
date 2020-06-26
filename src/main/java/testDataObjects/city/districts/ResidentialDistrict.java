package testDataObjects.city.districts;

import java.util.List;

import testDataObjects.city.districts.buildings.ResidentialBuilding;

public class ResidentialDistrict extends District {
	public int inhabitantCount;
	public List<ResidentialBuilding> buildings;
	
	public ResidentialDistrict() {
		
	}
	
	public ResidentialDistrict(
		String districtName,
		int inhabitantCount,
		List<ResidentialBuilding> buildings
	) {
		super(districtName);
		this.inhabitantCount = inhabitantCount;
		this.buildings = buildings;
	}
}
