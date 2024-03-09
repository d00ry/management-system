package converter;

import dto.CategoryRequest;
import entity.Category;

public class CategoryConverter {
    public static Category convertRequestToEntity(CategoryRequest categoryRequest) {

        Category category = new Category();
        category.setId(categoryRequest.getId());
        category.setTitle(categoryRequest.getTitle());
        category.getCreatedAt(categoryRequest.getCreatedAt());
        category.getUpdatedAt(categoryRequest.getUpdatedAt());

        return category;
    }
}

