package dao;

import entity.Category;
import entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class CategoryDaoIMPL implements CategoryDao{
    private final SessionFactory sessionFactory;

    public  CategoryDaoIMPL(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Category category) {
        try(Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(category);
            transaction.commit();
        }catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }
}
