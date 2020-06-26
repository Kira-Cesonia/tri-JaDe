package testDataObjects.city.districts;

import java.util.List;

import testDataObjects.city.districts.buildings.IndustrialBuilding;

public class IndustrialDistrict extends District {
	public int yearlyCo2EmissionTons;
	public List<IndustrialBuilding> buildings;
	
	public IndustrialDistrict() {
		
	}
	
	public IndustrialDistrict(
		String districtName,
		int yearlyCo2EmissionTons,
		List<IndustrialBuilding> buildings
	) {
		super(districtName);
		this.yearlyCo2EmissionTons = yearlyCo2EmissionTons;
		this.buildings = buildings;
	}
}
