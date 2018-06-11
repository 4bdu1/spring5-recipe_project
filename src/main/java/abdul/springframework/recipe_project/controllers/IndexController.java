package abdul.springframework.recipe_project.controllers;

import abdul.springframework.recipe_project.domain.Category;
import abdul.springframework.recipe_project.domain.UnitOfMeasure;
import abdul.springframework.recipe_project.repositories.CategoryRepository;
import abdul.springframework.recipe_project.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by 4bdul on 10/06/2018 at 10:58 AM.
 */

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"/","","index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByUom("Teaspoon");

        System.out.println("Cat Id is: "+categoryOptional.get().getId());
        System.out.println("UOM Id is: "+unitOfMeasureOptional.get().getId());
        return "index";
    }
}
