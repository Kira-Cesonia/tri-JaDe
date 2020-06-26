package testDataObjects.city;

import java.util.*;

import testDataObjects.city.districts.CommercialDistrict;
import testDataObjects.city.districts.District;
import testDataObjects.city.districts.IndustrialDistrict;
import testDataObjects.city.districts.ResidentialDistrict;
import testDataObjects.city.districts.buildings.CommercialBuilding;
import testDataObjects.city.districts.buildings.Cottage;
import testDataObjects.city.districts.buildings.IndustrialBuilding;
import testDataObjects.city.districts.buildings.Office;
import testDataObjects.city.districts.buildings.ResidentialBuilding;
import testDataObjects.city.districts.buildings.School;
import testDataObjects.city.districts.buildings.Supermarket;
import testDataObjects.city.districts.buildings.ToxicWasteFactory;
import testDataObjects.city.persons.PlaceOwner;
import testDataObjects.city.persons.Teacher;

public class Cities {
	public static City newPorkCity() {
		List<District> districts = new ArrayList<>();
		
		List<IndustrialBuilding> westernIndustryParkBuildings
			= new ArrayList<>();
		PlaceOwner porky = new PlaceOwner(9001, "Porky");
		ToxicWasteFactory firstToxicWasteFactory
			= new ToxicWasteFactory("Toxic Waster Factory 1", 2500, porky);
		westernIndustryParkBuildings.add(firstToxicWasteFactory);
		
		ToxicWasteFactory secondToxicWasteFactory
			= new ToxicWasteFactory("Toxic Waster Factory 2", 2500, porky);
		westernIndustryParkBuildings.add(secondToxicWasteFactory);
		
		IndustrialDistrict westernIndustryPark
			= new IndustrialDistrict(
				"Western Industry Park", 5000, westernIndustryParkBuildings);
		districts.add(westernIndustryPark);
		
		ToxicWasteFactory thirdToxicWasteFactory
			= new ToxicWasteFactory("Toxic Waster Factory 3", 3000, porky);
		westernIndustryParkBuildings.add(thirdToxicWasteFactory);
		
		IndustrialDistrict easternIndustryPark
			= new IndustrialDistrict(
				"Eastern Industry Park", 3000, westernIndustryParkBuildings);
		districts.add(easternIndustryPark);
		
		List<CommercialBuilding> mainCommercialDistrictBuildings
			= new ArrayList<>();
		Supermarket porkMart = new Supermarket("PorkMart", "Frocieries", porky);
		mainCommercialDistrictBuildings.add(porkMart);
		
		CommercialDistrict mainCommercialDistrict
			= new CommercialDistrict(
				"Main Commercial District",
				"Overpriced Stuff",
				mainCommercialDistrictBuildings
			);
		districts.add(mainCommercialDistrict);
		
		List<ResidentialBuilding> slavePenBuildings = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			Cottage slavePenBuilding = new Cottage(
				"Cheese of Pain",
				"Slave Pen " + Integer.toString(i),
				50
			);
			slavePenBuildings.add(slavePenBuilding);
		}
		
		ResidentialDistrict slavePens
			= new ResidentialDistrict("Slave Pens", 500, slavePenBuildings);
		districts.add(slavePens);
		
		City city = new City(districts, "New Pork City", "city1");
		return city;
	}
	
	public static City precociousNeighborhood() {
		List<District> districts = new ArrayList<>();
		
		List<ResidentialBuilding> sapphireLakeBuildings = new ArrayList<>();
		Cottage autumnsHouse = new Cottage(
			"Librarian Cheese",
			"The Pingo Family Home",
			3
		);
		sapphireLakeBuildings.add(autumnsHouse);
		
		Cottage jacobsHouse = new Cottage(
			"Catered Cheese",
			"The Linkletter Abode",
			3
		);
		sapphireLakeBuildings.add(jacobsHouse);
		
		Cottage tiffanysHouse = new Cottage(
			"Chaotic Cheese",
			"The Et Madhouse",
			7
		);
		sapphireLakeBuildings.add(tiffanysHouse);
		
		Cottage budsHouse = new Cottage(
			"Gourmet Cheese",
			"The Oven Ruin",
			4
		);
		sapphireLakeBuildings.add(budsHouse);
		
		List<Teacher> teachers = new ArrayList<>();
		Teacher msMonster
			= new Teacher("Advanced Monstrology", "Bette Monster");
		teachers.add(msMonster);
		
		Teacher msBard
			= new Teacher("Chaos Control", "Mitzy Bard");
		teachers.add(msBard);
		
		School poppinstockAcademy
			= new School(teachers, "Poppinstock Academy", 0);
		sapphireLakeBuildings.add(poppinstockAcademy);
		
		ResidentialDistrict sapphireLake = new ResidentialDistrict(
			"Sapphire Lake",
			100,
			sapphireLakeBuildings
		);
		districts.add(sapphireLake);
		
		List<ResidentialBuilding> diamondBluffsBuildings = new ArrayList<>();
		Cottage maxsHouse = new Cottage(
			"Sportsy Cheese",
			"The Zeit Place",
			3
		);
		diamondBluffsBuildings.add(maxsHouse);
		
		Cottage dionnesHouse = new Cottage(
			"Evil Cheese",
			"Dionne's Bone Palace",
			3
		);
		diamondBluffsBuildings.add(dionnesHouse);
		
		ResidentialDistrict diamondBluffs = new ResidentialDistrict(
			"Diamond Bluffs",
			100,
			diamondBluffsBuildings
		);
		districts.add(diamondBluffs);
		
		List<ResidentialBuilding> emeraldWoodsBuildings = new ArrayList<>();
		Cottage suzettesHouse = new Cottage(
			"Resistant Cheese",
			"The Gardy Base",
			3
		);
		emeraldWoodsBuildings.add(suzettesHouse);
		
		ResidentialDistrict emeraldWoods = new ResidentialDistrict(
			"Emerald Woods",
			100,
			emeraldWoodsBuildings
		);
		districts.add(emeraldWoods);
		
		List<CommercialBuilding> walkingMallBuildings = new ArrayList<>();
		PlaceOwner unknownOwner = new PlaceOwner(-1, "Unknown Owner");
		Supermarket theDeathPlace = new Supermarket(
			"DoDah's Ice Cream",
			"Ice Cream",
			unknownOwner 
		);
		walkingMallBuildings.add(theDeathPlace);
		
		Office townOffice = new Office("Town Office", "Administration", 12);
		walkingMallBuildings.add(townOffice);
		
		CommercialDistrict yeOldeTownWalkingMall = new CommercialDistrict(
			"Ye Olde Town Walking Mall",
			"Obscure Stuff",
			walkingMallBuildings 
		);
		districts.add(yeOldeTownWalkingMall);
		
		City city = new City(districts, "Precocious Neigborhood", "city1");
		return city;
	}
}
