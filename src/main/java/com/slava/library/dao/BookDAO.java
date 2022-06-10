package com.slava.library.dao;


import com.slava.library.entity.Book;

import java.util.List;

public interface BookDAO {
    public List<Book> getAll();

   public void save(Book book);

   public Book getById(int id);

    public void deleteById(int id);
}
