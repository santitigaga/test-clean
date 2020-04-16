package co.com.bancolombia.config;

import co.com.bancolombia.model.product.gateways.ProductRepository;
import co.com.bancolombia.usecase.product.ProductUseCase;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TatoConfig {

    @Bean
    public ProductUseCase createProductUseCase(ProductRepository productRepository) {
        System.out.println("");

        try {

            return new ProductUseCase(productRepository);

        }catch (Exception ex){

            System.out.println(ex.getMessage());
            return null;

        }
    }

    @Bean
    public ObjectMapperImp objectMapper() {
        System.out.println("");

        try {

            return new ObjectMapperImp();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

}
