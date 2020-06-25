package mongoDb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.mongodb.MongoClient;

import exceptions.DatabaseNotConnectedException;
import testDataObjects.legion.Company;
import testDataObjects.legion.Legion;
import testDataObjects.legion.LegionFactory;


class MongoDbReaderTest {
	
	private static final int TEST_LEGION_ID = 0;
	private static final int COMPANY_COUNT = 100;
	private static final int LEGIONNAIRES_PER_COMPANY = 100;
	private static MongoDbReader legionReader;
	private static MongoDbWriter legionWriter;

	@BeforeAll
	static void setUpLegionReader() throws DatabaseNotConnectedException {
		MongoDbConnection mongoDB_connection = new MongoDbConnection();
		MongoClient mongoDatabaseConnectionPool = mongoDB_connection.mongoDatabaseConnectionPool;
		legionReader = new MongoDbReader(mongoDatabaseConnectionPool);
		legionWriter = new MongoDbWriter();
		legionWriter.legionDatabase.drop();
		Legion testLegion = LegionFactory.createLegion(
			TEST_LEGION_ID,
			COMPANY_COUNT,
			LEGIONNAIRES_PER_COMPANY
		);
		legionWriter.writeLegionToMongoDB(testLegion);
	}
	
	@Test
	//[Kira 2020-06-25]: This test exists primarily as a speed comparison
	//                   to compare how long a native MongoDB read query
	//                   takes with a given amount of data in relation to
	//                   a tri-Jade read Query
	void readLegionFromMongoDbByIdShouldReturnLegionWithCorrectCompanyCount() {
		Legion testLegion = legionReader.readLegionFromMongoDbById(TEST_LEGION_ID);
		
		assertEquals(COMPANY_COUNT, testLegion.companies.size());
	}
	
	@Test
	//[Kira 2020-06-25]: This test exists primarily as a speed comparison
	//                   to compare how long a native MongoDB read query
	//                   takes with a given amount of data in relation to
	//                   a tri-Jade read Query
	void readLegionFromMongoDbByIdShouldReturnLegionWithCorrectNumberOfLegionnaires() {
		Legion testLegion = legionReader.readLegionFromMongoDbById(TEST_LEGION_ID);
		
		int actualLegionnaireCount = 0;
		for(Company company : testLegion.companies) {
			actualLegionnaireCount += company.legionnaires.size();
		}
		
		assertEquals(COMPANY_COUNT * LEGIONNAIRES_PER_COMPANY, actualLegionnaireCount);
	}
	
}
