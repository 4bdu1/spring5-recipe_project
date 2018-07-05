package abdul.springframework.recipe_project.services;

import abdul.springframework.recipe_project.commands.IngredientCommand;

/**
 * Created by 4bdul on 24/06/2018 at 5:19 PM.
 */

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
