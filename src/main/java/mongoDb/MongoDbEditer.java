package mongoDb;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;
import static com.mongodb.client.model.Filters.*;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import testDataObjects.legion.Legion;

public class MongoDbEditer {
	
	MongoClient mongoDatabaseConnectionPool;
	private static final String LEGION_DATABASE_NAME = "legion_database";
	private static final String LEGION_COLLECTION_NAME = "legion_collection";
	
	public MongoDbEditer(MongoClient mongoDatabaseConnectionPool) {
		this.mongoDatabaseConnectionPool = mongoDatabaseConnectionPool;
	}
	
	public void updateCharacter(Legion character) {
		MongoCollection<Legion> characterCollection = getCharacterCollection();
		Bson filter = eq("_id", character._id);
		characterCollection.replaceOne(filter, character);
	}
	
	private MongoCollection<Legion> getCharacterCollection() {
		MongoDatabase characterDatabase
			= mongoDatabaseConnectionPool.getDatabase(LEGION_DATABASE_NAME);
		MongoDbOperations mongoDB_operations
			= new MongoDbOperations(mongoDatabaseConnectionPool);
		CodecRegistry pojoCodecRegistry
			= mongoDB_operations.buildPOJO_codecRegistry();
		
		characterDatabase
			= characterDatabase.withCodecRegistry(pojoCodecRegistry);
		
		MongoCollection<Legion> characterCollection
			= characterDatabase.getCollection(
				LEGION_COLLECTION_NAME,
				Legion.class
			);
		return characterCollection;
	}
}
