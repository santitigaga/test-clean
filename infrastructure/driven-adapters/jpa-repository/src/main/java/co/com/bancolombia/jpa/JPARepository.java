package co.com.bancolombia.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface JPARepository extends CrudRepository<ProductData, String>, QueryByExampleExecutor<ProductData> {
}