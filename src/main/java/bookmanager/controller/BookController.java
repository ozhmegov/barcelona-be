package bookmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @RequestMapping(value = "/")
    public String index() {
        return "redirect:/view/books.html";
    }
}
