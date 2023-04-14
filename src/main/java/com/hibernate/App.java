package com.hibernate;

import java.util.List;

/* import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration; */

import com.hibernate.models.User;

import jakarta.persistence.*;

/* import java.util.ArrayList;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import MongoDao.MongoClientConnection;
import models.User; */

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        //CONNECTION WITH MONGODB
       /*  ArrayList<?> databases = new ArrayList<>();
        MongoDatabase database = null;
        MongoCollection<User> collection = null;
        MongoClientConnection con = new MongoClientConnection();
        MongoClient connection = con.getConnection();
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        /* MongoClientSettings settings = MongoClientSettings.builder()
                .codecRegistry(pojoCodecRegistry)
                .build();
        MongoClient mongoClientSettings = MongoClients.create(settings); 

        try {
            databases = connection.listDatabases().into(new ArrayList<Document>());
            for (Object db : databases) {
                System.out.println(db);
            }
            database = connection.getDatabase("hibernatedb");
            collection = database.getCollection("users", User.class);
            collection = collection.withCodecRegistry(pojoCodecRegistry);
            //long size = collection.countDocuments();
            //User user = new User(size,"Silva");
            //collection.insertOne(user);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        //con.closeConnection();
         try {
            Bson filter = Filters.eq("_id", 3);
            FindIterable<User> users = collection.find(filter);
            /* for(User u : users){
                System.out.println("USERS: " + u);
            }
            users.forEach(user -> {
                System.out.println(user);
            });

        }catch(Exception e){
            e.printStackTrace();
        }  */
       

        //CONNECTIO WITH MYSQL
        //COMING FROM  hibernate.cfg.xml
        /* SessionFactory sessionFactory = new Configuration()
        .configure("resources/hibernate.cfg.xml")
        .addAnnotatedClass(User.class)
        .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            User user = new User(null, "Jababa Luis");
            List<User> users = session.createQuery("from user where name LIKE '%Luis%'", User.class).list();
            /* List<User> users = session.createQuery("from user where name LIKE '%Luis'", User.class).list();
            List<User> users = session.createQuery("from user where name LIKE 'Luis%'", User.class).list(); 
            session.get(User.class, user);
            for(User u : users){
                System.out.println( "USER (" + u.getName() + ") : " + u.getId() );
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();       
        }finally{
            sessionFactory.close();
        } */


        //USING JPA
        //Coming from persistence.xml
       /*  EntityManagerFactory emf = Persistence.createEntityManagerFactory("cinema");
        EntityManager em = emf.createEntityManager();

        TypedQuery<User> users = em.createNamedQuery("getAllUsers", User.class);

        List<User> userslist = users.getResultList();

        userslist.forEach(user -> {
            System.out.println(user);
        });

        em.close(); */
} 
}