package abdul.springframework.recipe_project.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 4bdul on 05/07/2018 at 5:19 AM.
 */
@Slf4j
@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public void saveImageFile(Long recipeId, MultipartFile file) {
        log.debug("Received a file");
    }
}
