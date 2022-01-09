package com.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;
import com.mongodb.client.model.Updates;
import java.util.Arrays;
import java.util.Iterator;
import org.bson.Document;

/**
 *
 * @author hp
 */
public class ConTest {

    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase db = mongoClient.getDatabase("JijoTest");
        MongoCollection<Document> collection = db.getCollection("TBL_CRUD");

        //Inserting sample record by creating collection and document.
        ConTest cont = new ConTest();
        //cont.insert(collection,"Maria",110);
        //cont.insert(collection,"Eswin",101);
        //cont.insert(collection,"esmia",102);
        //cont.insert(collection,"Josna",103);
        
        //cont.select(collection);
        cont.search(collection,"Jijo");
        //cont.update(collection,"Jijo","JAc");
        //cont.delete(collection, "JAc");
        //cont.dropTable(collection);
        
        cont.aggregatePipe(collection);

    }
    
    public void aggregatePipe(MongoCollection<Document> collection) {
        AggregateIterable<Document> iterable = collection.aggregate(Arrays.asList(
                new Document("$match",new Document("House","Ambrayil").append("Place", "MPUAM")),
                new Document("$group",new Document("_id", "$" + "id").append("count", new Document("$sum", 1)))));
 
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
   

    public void dropTable(MongoCollection<Document> collection) {
        collection.drop();
        System.out.println("Collection dropped successfully");
    }

    public void delete(MongoCollection<Document> collection, String name) {
        collection.deleteOne(Filters.eq("name", name));
    }

    public void update(MongoCollection<Document> collection, String name, String newName) {
        collection.updateOne(Filters.eq("name", name), Updates.set("name", newName));
    }

    public void search(MongoCollection<Document> collection, String name) {
        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("name", name);
        FindIterable<Document> iterDoc = collection.find(searchQuery).projection(fields(include("name","id")));
        // Getting the iterator  test_b1
        System.out.println("Listing All Mongo Documents");
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void select(MongoCollection<Document> collection) {

        FindIterable<Document> iterDoc = collection.find();
        int i = 1;
        // Getting the iterator
        System.out.println("Listing All Mongo Documents");
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            i++;
        }
    }

    public void insert(MongoCollection<Document> collection, String name, int id) {
        Document doc = new Document("name", name);
        doc.append("id", id);
        doc.append("House", "Ambrayil34");
        doc.append("Place", "MPUAM45");
        collection.insertOne(doc);
        System.out.println("Insert is completed");
    }

}
