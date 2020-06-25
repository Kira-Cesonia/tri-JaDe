package mongoDb;

import java.util.*;

import org.bson.codecs.configuration.CodecRegistry;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import testDataObjects.legion.Legion;

public class MongoDbReader {
	
	private static final String LEGION_DATABASE_NAME = "legion_database";
	private static final String LEGION_COLLECTION_NAME = "legion_collection";
	public MongoDatabase legionDatabase;
	
	public MongoDbReader(MongoClient mongoDatabaseConnectionPool) {
		legionDatabase = mongoDatabaseConnectionPool.getDatabase(LEGION_DATABASE_NAME);
		MongoDbOperations mongoDB_operations = new MongoDbOperations(mongoDatabaseConnectionPool);
		CodecRegistry pojoCodecRegistry = mongoDB_operations.buildPOJO_codecRegistry();
		
		legionDatabase = legionDatabase.withCodecRegistry(pojoCodecRegistry);
	}
	
	public Legion readLegionFromMongoDB_byIndex(int legionIndex) {
		MongoCollection<Legion> legionCollection = getLegionCollection();
		FindIterable<Legion> legionIterables = legionCollection.find();
		List<Legion> legionList = new ArrayList<Legion>();
		for(Legion legion : legionIterables) {
			legionList.add(legion);
		}
		return legionList.get(legionIndex);
	}
	
	public Legion readLegionFromMongoDbById(int _id) {
		MongoCollection<Legion> legionCollection = getLegionCollection();
		FindIterable<Legion> legionIterables = legionCollection.find();
		return findByID(legionIterables, _id);
	}
	
	private Legion findByID(FindIterable<Legion> legionIterables, int _id) {
		for(Legion legion : legionIterables ) {
			if(legion._id == _id) {
				return legion;
			}
		}
		return null;
	}
	
	private MongoCollection<Legion> getLegionCollection() {
		
		
		MongoCollection<Legion> legionCollection = legionDatabase.getCollection(LEGION_COLLECTION_NAME, Legion.class);
		return legionCollection;
	}
}
