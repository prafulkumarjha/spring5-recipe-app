package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * created by Praful Jha on 12/11/2017
 */
public interface CategoryRepository extends CrudRepository<Category,Long>{

    Optional<Category> findByDescription(String description);
}
