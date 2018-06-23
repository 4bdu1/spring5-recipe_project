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
public class UnitOfMeasureCommandToUnitOfMeasure implements Converter<UnitOfMeasureCommand,UnitOfMeasure> {

    @Synchronized
    @Nullable
    @Override
    public UnitOfMeasure convert(UnitOfMeasureCommand unitOfMeasureCommand) {
        if(unitOfMeasureCommand == null){
            return null;
        }

        final UnitOfMeasure uom = new UnitOfMeasure();
        uom.setId(unitOfMeasureCommand.getId());
        uom.setUom(unitOfMeasureCommand.getUom());
        return uom;
    }
}
