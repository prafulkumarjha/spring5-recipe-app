package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * created by Praful Jha on 13/11/2017
 */


public interface RecipeService {

    public Set<Recipe> getAllRecipe();

}
