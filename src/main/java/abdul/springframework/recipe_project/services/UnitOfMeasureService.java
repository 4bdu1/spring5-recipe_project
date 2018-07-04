package abdul.springframework.recipe_project.services;

import abdul.springframework.recipe_project.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by 4bdul on 04/07/2018 at 2:59 AM.
 */
public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
