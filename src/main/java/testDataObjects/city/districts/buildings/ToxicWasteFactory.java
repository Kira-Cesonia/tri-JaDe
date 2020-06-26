package testDataObjects.city.districts.buildings;

import testDataObjects.city.persons.PlaceOwner;

public class ToxicWasteFactory extends IndustrialBuilding {
	public PlaceOwner owner;
	
	public ToxicWasteFactory() {
		
	}
	
	public ToxicWasteFactory(
		String name,
		int yearlyCo2EmissionTons,
		PlaceOwner owner
	) {
		super(name, yearlyCo2EmissionTons);
		this.owner = owner;
	}
}
