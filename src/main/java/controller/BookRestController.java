package controller;

import model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.BookServiceImpl;

import java.util.List;

@RestController
public class BookRestController {

    private BookServiceImpl bookService;

    @RequestMapping(value="/books",method = RequestMethod.GET,headers="Accept=application/json")
    public List<Book> getAllTasks() {
        return bookService.listBooks();
    }

    /**
     * Sets bookService.
     *
     * @param bookService the new value.
     */
    public void setBookService(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

}
