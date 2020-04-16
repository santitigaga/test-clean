package co.com.bancolombia.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;


//@Configuration
public class MongoConfig {

    @Value("${mongoConfig.user}")
    private String dbUser;

    @Value("${mongoConfig.password}")
    private String dbPassword;

    @Value("${mongoConfig.database}")
    private String dbName;

    @Value("${mongoConfig.connectionString}")
    private String dbConnectionString;

    @Bean
    public MongoDbFactory mongoDbFactory() {
        MongoClientURI uri = new MongoClientURI("mongodb://192.168.99.100:");
        MongoClient mongoClient = new MongoClient(uri);
        return new SimpleMongoDbFactory(mongoClient, this.dbName);
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }

    private String getConnectionString() {
       return String.format(this.dbConnectionString, this.dbUser, this.dbPassword);

    }
}
