package dao;

import model.Book;

import java.util.List;

interface BookDao {
    void addBook(Book book);
    Book getBookById(int id);
    void removeBook(int id);
    void updateBook(Book book);
    List<Book> listBooks();
}
