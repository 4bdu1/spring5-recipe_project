package abdul.springframework.recipe_project.repositories;

import abdul.springframework.recipe_project.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * Created by 4bdul on 16/06/2018 at 3:50 PM.
 */

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryTestIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByUom() {

        Optional<UnitOfMeasure> unitOfMeasureOptional =  unitOfMeasureRepository.findByUom("Teaspoon");

        assertEquals("Teaspoon",unitOfMeasureOptional.get().getUom());
    }

    @Test
    public void findByUomCup() {

        Optional<UnitOfMeasure> unitOfMeasureOptional =  unitOfMeasureRepository.findByUom("Cup");

        assertEquals("Cup",unitOfMeasureOptional.get().getUom());
    }
}