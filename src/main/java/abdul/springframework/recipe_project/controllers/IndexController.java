package abdul.springframework.recipe_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 4bdul on 10/06/2018 at 10:58 AM.
 */

@Controller
public class IndexController {

    @RequestMapping({"/","","index"})
    public String getIndexPage(){
        return "index";
    }
}
