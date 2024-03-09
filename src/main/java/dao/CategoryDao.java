package dao;

import entity.Category;
import entity.Product;

import java.util.List;

public interface CategoryDao {
    void save(Category category);
    Product findById (Long id);
    List<Product> findAll();

}
