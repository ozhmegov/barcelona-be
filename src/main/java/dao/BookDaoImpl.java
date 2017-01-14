package dao;

import model.Book;
import org.springframework.stereotype.Repository;
import util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void addBook(Book book) {
        EntityManager entityManager = null;
        try {
            entityManager= HibernateUtil.INSTANCE.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(book);
            entityManager.getTransaction().commit();
            entityManager.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Book getBookById(int id) {
        EntityManager entityManager = null;
        Book book = null;
        try {
            entityManager = HibernateUtil.INSTANCE.getEntityManager();
            book = entityManager.find(Book.class, id);
            entityManager.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public void removeBook(int id) {
        EntityManager entityManager = null;
        try {
            entityManager= HibernateUtil.INSTANCE.getEntityManager();
            entityManager.getTransaction().begin();
            Book book = entityManager.find(Book.class, id);
            entityManager.remove(book);
            entityManager.getTransaction().commit();
            entityManager.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateBook(Book book) {
        EntityManager entityManager;
        try{
            entityManager = HibernateUtil.INSTANCE.getEntityManager();
            entityManager.getTransaction().begin();
            if (!entityManager.contains(book)) {
                entityManager.merge(book);
            }
            entityManager.getTransaction().commit();
            entityManager.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Book> listBooks() {
        List<Book> books = null;
        EntityManager entityManager = null;
        try {
            entityManager= HibernateUtil.INSTANCE.getEntityManager();
            entityManager.getTransaction().begin();
            Query query = entityManager.createQuery("SELECT e FROM Book e");
            books = query.getResultList();
            entityManager.getTransaction().commit();
            entityManager.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return books;
    }
}