package testDataObjects.city.districts.buildings;

import testDataObjects.city.persons.PlaceOwner;

public class Supermarket extends CommercialBuilding {
	public PlaceOwner owner;
	
	public Supermarket() {
		
	}
	
	public Supermarket(
		String name,
		String sectorName,
		PlaceOwner owner
	) {
		super(name, sectorName);
		this.owner = owner;
	}
}
