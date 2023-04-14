package MongoDao;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoClientConnection {
    MongoClientSettings settings;
    MongoClient mongoClient = null;
    public MongoClientConnection(){
        String connectionString = "mongodb+srv://Andrels:j7Ms0dYtDDxJt4fN@projectmern.i26wage.mongodb.net/?retryWrites=true&w=majority";

        ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();

        settings = MongoClientSettings.builder().applyConnectionString(new ConnectionString(connectionString)).serverApi(serverApi).build();
    }
    
    public MongoClient getConnection(){        
        // Create a new client and connect to the server
        try{
            try {
                 mongoClient = MongoClients.create(settings);
                // Send a ping to confirm a successful connection
                MongoDatabase database = mongoClient.getDatabase("hibernatedb");
                database.runCommand(new Document("ping", 1));
                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
            } catch (MongoException e) {
                e.printStackTrace();               

            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return mongoClient;
    } 
    public MongoClient closeConnection(){
        mongoClient.close();
        return mongoClient;
    }
}

