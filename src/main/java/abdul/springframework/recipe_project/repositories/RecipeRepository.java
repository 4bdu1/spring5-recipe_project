package abdul.springframework.recipe_project.repositories;

import abdul.springframework.recipe_project.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 4bdul on 11/06/2018 at 5:44 AM.
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
