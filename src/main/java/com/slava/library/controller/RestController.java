package com.slava.library.controller;

import com.slava.library.entity.Book;
import com.slava.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Autowired
    private BookService bookService;

    public List<Book> showAllBooks(){

        return null;
    }

    public Book showBookById(){

        return null;
    }

    public Book addNewBook(){

        return null;
    }

    public Book updateBook(){

        return null;
    }

    public String deleteBook(){

        return null;
    }
}
