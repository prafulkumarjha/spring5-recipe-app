package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * created by Praful Jha on 13/11/2017
 */
@Service
public class RecipeServiceImpl  implements  RecipeService{


    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public Set<Recipe> getAllRecipe() {

        Set<Recipe> recipes = new HashSet<Recipe>();

        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);

        return recipes;


    }
}
