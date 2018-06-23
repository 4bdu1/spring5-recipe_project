package abdul.springframework.recipe_project.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by 4bdul on 17/06/2018 at 3:49 PM.
 */
@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {
    private Long id;
    private String recipeNotes;
}
