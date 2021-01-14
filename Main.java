import java.util.Scanner;
import java.io.File;
import java.util.*;
import java.io.*;
//import com.google.gson.Gson;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.set;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class Main{
 public static void main(String[] args) {
 	try{
 	List<Character> IDs = CharID.getCharsID();
 	File namesFile = new File("output file.txt");
 	Scanner scan = new Scanner(namesFile);
 	List<String> names = new ArrayList<String>();
    while (scan.hasNextLine()){
    names.add(scan.nextLine());
    }
    MyBinaryTree tree = SortNames.initialSort(names,IDs);
      mongoClient = MongoClients.create();
           mongoDatabase = mongoClient.getDatabase("tree");
            CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                    fromProviders(PojoCodecProvider.builder().automatic(true).build()));
            mongoDatabase = mongoDatabase.withCodecRegistry(pojoCodecRegistry);
             mongoDatabase.getCollection("Tree",TreeNode.class).insertOne(tree.getHead());
   // Gson gson = new Gson();
   // File file = new File("NamesTree.json");
    //String j = gson.toJson(tree.getHead().getChilds().get(0));
   // System.out.println(j);
   // FileWriter writer = new FileWriter(file);
   // writer.write();
   // writer.close();
 }catch(Exception e){e.printStackTrace();}
 }
  private static MongoDatabase mongoDatabase;
    private static MongoClient mongoClient;
}