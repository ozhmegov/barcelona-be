package bookmanager.dao;

import bookmanager.model.Book;

import java.util.List;

public interface BookDao {
    void addBook(Book book);
    Book getBookById(int id);
    void removeBook(int id);
    void updateBook(Book book);
    List<Book> listBooks();
}
