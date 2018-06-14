package abdul.springframework.recipe_project.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by 4bdul on 11/06/2018 at 5:31 AM.
 */
@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipe;

}

