package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * created by Praful Jha on 12/11/2017
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long>{

}
