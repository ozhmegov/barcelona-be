package controller;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.BookServiceImpl;

import java.util.List;

@RestController
public class BookRestController {
    private BookServiceImpl bookService;

    @RequestMapping(value="/view/books.html",method = RequestMethod.GET)
    public List<Book> getAllBooks() {
        return bookService.listBooks();
    }

    /**
     * Sets bookService.
     *
     * @param bookService the new value.
     */
    @Autowired
    public void setBookService(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

}
