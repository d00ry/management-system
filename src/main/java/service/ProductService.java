package service;

import dto.ProductRequest;
import entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> notifyLowStock();
    void  createProduct(ProductRequest request);
}
