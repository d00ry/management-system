package validatior;

import dto.CategoryRequest;
import service.CategoryService;

public class CategoryValidator {

    public static void validateCategory(CategoryRequest categoryRequest) {
        if (categoryRequest.getTitle().isEmpty() || categoryRequest.getId()==0){
            throw new IllegalArgumentException();
        }

    }
}
