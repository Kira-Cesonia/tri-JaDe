package delta;

import static org.junit.jupiter.api.Assertions.*;

import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;
import org.junit.jupiter.api.*;

import de.danielbechler.diff.ObjectDiffer;
import de.danielbechler.diff.ObjectDifferBuilder;
import de.danielbechler.diff.node.DiffNode;
import testDataObjects.city.Cities;
import testDataObjects.city.City;
import testDataObjects.gameCharacter.GameCharacter;
import testDataObjects.gameCharacter.GameCharacters;


class DeltaApplierTest {
	
	static Javers javersInstance;
	 static ObjectDiffer objectDiffer;
	
	@BeforeAll
	static void prepareJaversInstance() {
		javersInstance = JaversBuilder.javers().build();
		objectDiffer = ObjectDifferBuilder.buildDefault();
	}
	
	@Test
	void applyDeltaShouldCorrectlyApplyDeltaToGameCharacter() {
		GameCharacter sylvia = GameCharacters.sylvia();
		GameCharacter sylviaEdited = GameCharacters.sylviaEdited();
		
		Diff sylviaDelta = javersInstance.compare(sylvia, sylviaEdited);
		GameCharacter sylviaWithAppliedDelta
			= DeltaApplier.applyDelta(sylvia, sylviaDelta);
		
		assertEquals(sylviaEdited.name, sylviaWithAppliedDelta.name);
	}
	
	@Test
	void applyDeltaShouldCorrectlyApplyDeltaToCity() {
		City newPorkCity = Cities.newPorkCity();
		City precociousNeighborhood = Cities.precociousNeighborhood();
		
		Diff cityDelta
			= javersInstance.compare(newPorkCity, precociousNeighborhood);
		City cityWithAppliedDelta
			= DeltaApplier.applyDelta(newPorkCity, cityDelta);
		
		assertEquals(precociousNeighborhood.name, cityWithAppliedDelta.name);
	}
	
	@Test
	void applyDiffDeltaShouldCorrectlyApplyDeltaToCity() {
		GameCharacter sylvia = GameCharacters.sylvia();
		GameCharacter sylviaEdited = GameCharacters.sylviaEdited();
		
		DiffNode cityDelta
			= objectDiffer.compare(sylvia, sylviaEdited);
		GameCharacter sylviaWithAppliedDelta
			= DeltaApplier.applyDelta(sylvia, cityDelta);
		
		assertEquals(sylviaEdited.name, sylviaWithAppliedDelta.name);
	}
}
