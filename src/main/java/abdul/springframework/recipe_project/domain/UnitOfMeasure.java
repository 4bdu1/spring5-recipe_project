package abdul.springframework.recipe_project.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by 4bdul on 11/06/2018 at 5:18 AM.
 */
@Getter
@Setter
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uom;

    @OneToOne
    private Ingredient ingredient;

}
