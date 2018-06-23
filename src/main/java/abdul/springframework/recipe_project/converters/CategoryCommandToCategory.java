package abdul.springframework.recipe_project.converters;

import abdul.springframework.recipe_project.commands.CategoryCommand;
import abdul.springframework.recipe_project.domain.Category;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by 4bdul on 17/06/2018 at 3:54 PM.
 */
@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {
    @Override
    public Category convert(CategoryCommand categoryCommand) {
        if (categoryCommand == null) {
            return null;
        }

        final Category category = new Category();
        category.setId(categoryCommand.getId());
        category.setDescription(categoryCommand.getDescription());
        return category;
    }
}
