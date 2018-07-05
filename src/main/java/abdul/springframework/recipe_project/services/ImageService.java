package abdul.springframework.recipe_project.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 4bdul on 05/07/2018 at 5:01 AM.
 */
@Service
public interface ImageService {
    void saveImageFile(Long recipeId, MultipartFile file);
}
