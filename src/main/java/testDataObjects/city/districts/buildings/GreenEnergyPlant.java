package testDataObjects.city.districts.buildings;

public class GreenEnergyPlant extends IndustrialBuilding {
	public int yearlyGeneratedMwh;
	
	public GreenEnergyPlant() {
		
	}
	
	public GreenEnergyPlant(
		String name,
		int yearlyCo2EmissionTons,
		int yearlyGeneratedMwh
	) {
		super(name, yearlyCo2EmissionTons);
		this.yearlyGeneratedMwh = yearlyGeneratedMwh;
	}
}
