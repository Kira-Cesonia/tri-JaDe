package testDataObjects.city.districts.buildings;

public class Office extends CommercialBuilding {
	public int employeeCount;
	
	public Office() {
		
	}
	
	public Office(
		String name,
		String sectorName,
		int employeeCount
	) {
		super(name, sectorName);
		this.employeeCount = employeeCount;
	}
}
