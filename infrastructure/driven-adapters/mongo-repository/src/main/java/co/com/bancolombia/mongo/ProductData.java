package co.com.bancolombia.mongo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@Document(collection = "productService")
public class ProductData {
    @Id
    private int id;
    @Field("name")
    private String name;
    @Field("description")
    private String description;
}
