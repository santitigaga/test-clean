package co.com.bancolombia.api;

import co.com.bancolombia.model.product.Product;
import co.com.bancolombia.usecase.product.ProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/product", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ApiRest {

    private final ProductUseCase useCase;

    @GetMapping()
    public Product getProduct(@RequestParam int id) {
        Product product = useCase.getProduct(id);
        return product;
    }

    @GetMapping()
    public List<Product> getProducts() {
        List<Product> products = useCase.getProducts();
        return products;
    }

}