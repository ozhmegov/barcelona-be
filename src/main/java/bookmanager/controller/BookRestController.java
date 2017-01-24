package bookmanager.controller;

import bookmanager.model.Book;
import bookmanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookRestController {
    private BookService bookService;

    @RequestMapping(value="/view/books.html",method = RequestMethod.GET, headers = "application/json")
    public List<Book> getAllBooks() {
        System.out.println("LLLL");
        for(Book book : bookService.listBooks()) System.out.println(book);
        return bookService.listBooks();
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
