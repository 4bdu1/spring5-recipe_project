package abdul.springframework.recipe_project.converters;

import abdul.springframework.recipe_project.commands.UnitOfMeasureCommand;
import abdul.springframework.recipe_project.domain.UnitOfMeasure;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * Created by 4bdul on 17/06/2018 at 3:57 PM.
 */
@Component
public class UnitOfMeasureToUnitOfMeasureCommand implements Converter<UnitOfMeasure, UnitOfMeasureCommand> {

    @Synchronized
    @Nullable
    @Override
    public UnitOfMeasureCommand convert(UnitOfMeasure unitOfMeasure) {

        if (unitOfMeasure != null) {
            final UnitOfMeasureCommand uomc = new UnitOfMeasureCommand();
            uomc.setId(unitOfMeasure.getId());
            uomc.setUom(unitOfMeasure.getUom());
            return uomc;
        }
        return null;
    }
}
