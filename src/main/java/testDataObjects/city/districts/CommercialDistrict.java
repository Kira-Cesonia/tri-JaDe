package testDataObjects.city.districts;

import java.util.List;

import testDataObjects.city.districts.buildings.CommercialBuilding;

public class CommercialDistrict extends District {
	public String leadingSector;
	public List<CommercialBuilding> buildings;
	
	public CommercialDistrict() {
		
	}
	
	public CommercialDistrict(
		String districtName,
		String leadingSector,
		List<CommercialBuilding> buildings
	) {
		super(districtName);
		this.leadingSector = leadingSector;
		this.buildings = buildings;
	}
}
