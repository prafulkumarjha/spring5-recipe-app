package guru.springframework.controller;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * created by Praful Jha on 12/11/2017
 */
@Controller
public class IndexController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UnitOfMeasureRepository unitOfMeasureRepository;


    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");

        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category Id is : "+categoryOptional.get().getId()+" ::  Category description is : "+
        categoryOptional.get().getDescription());

        System.out.println("UOM id is : "+unitOfMeasureOptional.get().getId()+
                " and description is : "+unitOfMeasureOptional.get().getDescription());



        return "index";
    }
    }
