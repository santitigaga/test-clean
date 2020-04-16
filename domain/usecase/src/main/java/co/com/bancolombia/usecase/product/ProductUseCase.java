package co.com.bancolombia.usecase.product;

import co.com.bancolombia.model.product.Product;
import co.com.bancolombia.model.product.gateways.ProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductUseCase {

    private final ProductRepository repository;


    public Product getProduct(int id) {
        return repository.getProduct(id);
    }

    public List<Product> getProducts() {
        return repository.getProducts();
    }

}
