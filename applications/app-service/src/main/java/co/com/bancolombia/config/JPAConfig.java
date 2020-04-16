package co.com.bancolombia.config;

import co.com.bancolombia.model.product.gateways.ProductRepository;
import co.com.bancolombia.usecase.product.ProductUseCase;
import org.apache.commons.dbcp2.BasicDataSource;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JPAConfig {
    @Value("${jpa.connection.dbName}")
    private String dbName;

    @Value("${jpa.connection.port}")
    private String port;

    @Value("${jpa.connection.host}")
    private String host;

    @Value("${jpa.connection.user}")
    private String user;

    @Value("${jpa.connection.password}")
    private String password;

    @Value("${jpa.connection.url}")
    private String dbConnectionString;

    @Value("${jpa.driver}")
    private String dbDriver;

    @Bean
    public BasicDataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        try {
            dataSource.setDriverClassName(this.dbDriver);
            dataSource.setUrl(String.format(this.dbConnectionString, this.host, this.port, this.dbName));
            dataSource.setUsername(this.user);
            dataSource.setPassword(this.password);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        return dataSource;
    }





}
