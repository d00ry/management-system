package service;

import dto.CategoryRequest;
import entity.Category;

import java.util.List;

public interface CategoryService {

    Category findBy(Long id);
    List<Category>findAll();

    void createdCategory(CategoryRequest categoryRequest);

}
