package service;

import config.HibernateCongif;
import converter.ProductConverter;
import dao.ProductDao;
import dao.ProductDaoIMPL;
import dto.ProductRequest;
import entity.Product;
import org.hibernate.SessionFactory;
import validatior.ProductValidator;


import java.util.ArrayList;
import java.util.List;

public class ProductServiceIMPL implements ProductService {

    private final SessionFactory sessionFactory = HibernateCongif.getSessionFactory();
    private final ProductDao productDao = new ProductDaoIMPL(sessionFactory);

    private final Integer limitStock = 5;

    @Override
    public void createProduct(ProductRequest request) {
        ProductValidator.validateProduct(request);
        Product product = ProductConverter.convertRequestToEntity(request);
        productDao.save(product);
    }
    @Override
    public List<Product> notifyLowStock() {
        List<Product> products = new ArrayList<>();
        List<Product> lowStock= new ArrayList<>();
        for(Product product : products){
            if (product.getQuantity()<limitStock){
                lowStock.add(product);
            }
        }
        return lowStock;
    }
}
