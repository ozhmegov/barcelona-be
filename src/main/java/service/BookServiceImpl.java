package service;

import dao.BookDao;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    @Override
    public void addBook(Book book) {
        this.bookDao.addBook(book);
    }

    @Override
    public Book getBookById(int id) {
        return this.bookDao.getBookById(id);
    }

    @Override
    public void removeBook(int id) {
        this.bookDao.removeBook(id);
    }

    @Override
    public void updateBook(Book book) {
        this.bookDao.updateBook(book);
    }

    @Override
    public List<Book> listBooks() {
        return this.bookDao.listBooks();
    }

    /**
     * Sets bookDao.
     *
     * @param bookDao the new value.
     */
    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}