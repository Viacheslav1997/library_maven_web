package com.slava.library.service;



import com.slava.library.dao.BookDAO;
import com.slava.library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;


    @Override
    @Transactional
    public List<Book> getAll() {
        return bookDAO.getAll();
    }
//
    @Override
    @Transactional
    public void save(Book book) {
        bookDAO.save(book);
    }
//
    @Override
    @Transactional
    public Book getById(int id) {
        return bookDAO.getById(id);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        bookDAO.deleteById(id);
    }
}
