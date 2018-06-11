package abdul.springframework.recipe_project.repositories;

import abdul.springframework.recipe_project.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by 4bdul on 11/06/2018 at 5:45 AM.
 */
public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);
}
