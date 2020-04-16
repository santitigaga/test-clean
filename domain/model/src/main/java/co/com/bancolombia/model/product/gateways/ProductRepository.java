package co.com.bancolombia.model.product.gateways;

import co.com.bancolombia.model.product.Product;

import java.util.List;

public interface ProductRepository {
    Product getProduct(int id);

    List<Product> getProducts();

}
