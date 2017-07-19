package barcelona.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class IndexController {
    @CrossOrigin
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ArrayList<String> index() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        return list;
    }
}
