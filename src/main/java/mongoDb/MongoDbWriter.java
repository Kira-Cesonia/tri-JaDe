package mongoDb;

import org.bson.codecs.configuration.CodecRegistry;

import com.mongodb.MongoClient;
import com.mongodb.client.*;

import exceptions.DatabaseNotConnectedException;
import testDataObjects.legion.Legion;

public class MongoDbWriter {
	
	private static final String LEGION_DATABASE_NAME = "legion_database";
	private static final String LEGION_COLLECTION_NAME = "legion_collection";
	
	MongoCollection<Legion> legionCollection;
	public MongoDatabase legionDatabase;
	
	public MongoDbWriter() throws DatabaseNotConnectedException {
		MongoDbConnection mongoDB_connection = establishConnectionToMongoDB();
		MongoClient mongoDatabaseConnectionPool = mongoDB_connection.mongoDatabaseConnectionPool;
		
		MongoDbOperations mongoDB_operations = new MongoDbOperations(mongoDatabaseConnectionPool);
		CodecRegistry pojoCodecRegistry = mongoDB_operations.buildPOJO_codecRegistry();
		legionDatabase = mongoDatabaseConnectionPool.getDatabase(LEGION_DATABASE_NAME);
		legionDatabase = legionDatabase.withCodecRegistry(pojoCodecRegistry);
	
		legionCollection = legionDatabase.getCollection(LEGION_COLLECTION_NAME, Legion.class);
	}

	public void writeLegionToMongoDB(Legion legion) throws DatabaseNotConnectedException {
		legionCollection.insertOne(legion);
	}
	
	public void dropLegionCollection() {
		legionCollection.drop();
	}
	
	public MongoDbConnection establishConnectionToMongoDB() throws DatabaseNotConnectedException {
		MongoDbConnection mongoDB_connection = new MongoDbConnection();
		return mongoDB_connection;
	}
}
