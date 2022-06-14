package com.slava.library.dao;


import com.slava.library.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Book> getAll() {

        Session session = sessionFactory.getCurrentSession();
        List<Book> allEmployees = session.createQuery("from Book", Book.class)
                .getResultList();

        return allEmployees;
    }

    @Override
    public void save(Book book) {

        Session session = sessionFactory.getCurrentSession();
        System.out.println("DAO save(): " + book);
        session.saveOrUpdate(book);

    }
//
    @Override
    public Book getById(int id) {


        Session session = sessionFactory.getCurrentSession();

        Book book = session.get(Book.class, id);

        return book;
    }
//
    @Override
    public void deleteById(int id) {

        Session session = sessionFactory.getCurrentSession();
        Book book = session.get(Book.class, id);
        session.delete(book);

    }
}
