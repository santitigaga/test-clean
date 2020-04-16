package co.com.bancolombia.jpa;

import co.com.bancolombia.model.product.Product;
import co.com.bancolombia.model.product.gateways.ProductRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Product, ProductData, String,JPARepository>
       implements ProductRepository
{

    @Autowired
    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Product.ProductBuilder.class).build());
    }

    @Override
    public Product getProduct(int id) {
        return super.findById(id + "");
    }

    @Override
    public List<Product> getProducts() {
        return super.toList(repository.findAll());
    }
}