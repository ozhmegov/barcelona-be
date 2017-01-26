package bookmanager.controller;

import bookmanager.model.Book;
import bookmanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
