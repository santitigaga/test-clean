package co.com.bancolombia.model.product;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Product{
    private int id;
    private String name;
    private String description;


}
