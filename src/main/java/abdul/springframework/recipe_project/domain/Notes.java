package abdul.springframework.recipe_project.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by 4bdul on 10/06/2018 at 2:31 PM.
 */
@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
