package com.slava.library.controller;

import com.slava.library.entity.Book;
import com.slava.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ThisRestController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> showAllBooks(){

        List<Book> books = bookService.getAll();
        return books;
    }

    @GetMapping("/books/{id}")
    public Book showBookById(@PathVariable int id){

        Book book = bookService.getById(id);
        return book;
    }

    @PostMapping("/books")
    public Book addNewBook(@RequestBody Book book){

        bookService.save(book);
        return book;
    }

    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book){

        bookService.save(book);
        return book;
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable int id){

        Book book = bookService.getById(id);
        bookService.deleteById(id);

        return "Book: '" + book.getBook() + "' were deleted. (Id = " + book.getId()+")." ;
    }
}
