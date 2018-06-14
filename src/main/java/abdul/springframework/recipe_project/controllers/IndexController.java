package abdul.springframework.recipe_project.controllers;

import abdul.springframework.recipe_project.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 4bdul on 10/06/2018 at 10:58 AM.
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/","","index"})
    public String getIndexPage(Model model){
        log.debug("Index Page Controller: getIndexPage()");
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
