package service;

import config.HibernateCongif;
import converter.CategoryConverter;
import converter.ProductConverter;
import dao.CategoryDao;
import dao.CategoryDaoIMPL;
import dao.ProductDao;
import dao.ProductDaoIMPL;
import dto.CategoryRequest;
import dto.ProductRequest;
import entity.Category;
import entity.Product;
import org.hibernate.SessionFactory;
import validatior.CategoryValidator;
import validatior.ProductValidator;

import java.util.ArrayList;
import java.util.List;

public class CategoryRequestIMPL implements CategoryService{
    private final SessionFactory sessionFactory = HibernateCongif.getSessionFactory();
    private final CategoryDao categoryDao = new CategoryDaoIMPL(sessionFactory);


    @Override
    public Category findBy(Long id) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public void createdCategory(CategoryRequest categoryRequest) {
        CategoryValidator.validateCategory(categoryRequest);
        Category category = CategoryConverter.convertRequestToEntity(categoryRequest);
        categoryDao.save(category);

    }
}
