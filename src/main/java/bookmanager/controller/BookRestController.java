package bookmanager.controller;

import bookmanager.model.Book;
import bookmanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookRestController {
    private BookService bookService;

    @RequestMapping(value="/view/listBooks",method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        return bookService.listBooks();
    }

    @RequestMapping(value="/view/addBook",method = RequestMethod.POST)
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @RequestMapping(value="/view/removeBook/{id}",method = RequestMethod.DELETE)
    public void removeBook(@PathVariable("id") int id) {
        bookService.removeBook(id);
    }

    @RequestMapping(value="/view/updateBook",method = RequestMethod.PUT)
    public void updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
    }

    @RequestMapping(value="/view/getBook/{id}",method = RequestMethod.GET)
    public Book getBook(@PathVariable("id") int id) {
        System.out.println(id);
        return null;
    }

    /**
     * Sets bookService.
     *
     * @param bookService the new value.
     */
    @Autowired(required = true)
    @Qualifier(value = "bookService")
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

}
