package abdul.springframework.recipe_project.services;

import abdul.springframework.recipe_project.domain.Recipe;

import java.util.Set;

/**
 * Created by 4bdul on 13/06/2018 at 5:41 PM.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);
}
