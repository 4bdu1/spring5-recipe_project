package abdul.springframework.recipe_project.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by 4bdul on 16/06/2018 at 1:16 PM.
 */
public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4L;
        category.setId(idValue);

        assertEquals(idValue,category.getId());
    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}