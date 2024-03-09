package dao;

import entity.Product;

import java.util.List;

public interface ProductDao {
    void save(Product product);

    Product findById (Long id);
    List<Product> findAll();
}
