package abdul.springframework.recipe_project.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by 4bdul on 11/06/2018 at 5:18 AM.
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uom;

    @OneToOne
    private Ingredient ingredient;

}
