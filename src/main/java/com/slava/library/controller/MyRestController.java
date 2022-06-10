package com.slava.library.controller;



import com.slava.library.entity.Book;
import com.slava.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MyRestController {

    @Autowired
    private BookService bookService;


    @RequestMapping("/books")
    public String showAll(Model model){
        //Получаем все книги из базы данных используя буксервис
        List<Book> allBooks = bookService.getAll();
        //В модель передаем атрибуты для jsp
        model.addAttribute("allBooks", allBooks);
        return "all-books";
    }

    @RequestMapping("/returnBook")
    public String returnBook(@RequestParam("bookId") int id){


        Book book = bookService.getById(id);

        book.setQuantity(book.getQuantity() + 1);

        bookService.save(book);

        return "redirect:/books";
    }

    @RequestMapping("/takeBook")
    public String takeBook(@RequestParam("bookId") int id){

        Book book = bookService.getById(id);
        book.setQuantity(book.getQuantity() - 1);
        bookService.save(book);

        return "redirect:/books";
    }

    @RequestMapping("/deleteBook")
    public String deleteBook(@RequestParam("bookId") int id){

        bookService.deleteById(id);

        return "redirect:/books";
    }

    @RequestMapping("/newBookForm")
    public String newBookForm(Model model){
        Book newBook = new Book();
        model.addAttribute("book", newBook);
        return "new-book-form";
    }

    @RequestMapping("/newBook")
    public String newBook(@ModelAttribute("book") Book book){

        bookService.save(book);

        return "redirect:/books";
    }

}
