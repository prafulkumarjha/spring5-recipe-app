package guru.springframework.controller;

import guru.springframework.domain.Recipe;
import guru.springframework.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

/**
 * created by Praful Jha on 12/11/2017
 */
@Controller
public class IndexController {

    @Autowired
    private  RecipeService recipeService;

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {


      //  System.out.println("UOM id is : "+unitOfMeasureOptional.get().getId()+
        //        " and description is : "+unitOfMeasureOptional.get().getDescription());

        Set<Recipe> recipes = recipeService.getAllRecipe();

        model.addAttribute("recipes",recipes);



        return "index";
    }
    }
