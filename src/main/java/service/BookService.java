package service;

import model.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    Book getBookById(int id);
    void removeBook(int id);
    void updateBook(Book book);
    List<Book> listBooks();
}
