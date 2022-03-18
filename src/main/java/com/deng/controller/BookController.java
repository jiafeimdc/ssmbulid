package com.deng.controller;

import com.deng.pojo.Books;
import com.deng.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;


    @RequestMapping("/allBook")
    public String get(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("msg",books);
        return "allBook";
    }
}
