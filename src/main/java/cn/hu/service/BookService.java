package cn.hu.service;

import cn.hu.dao.BookDao;
import cn.hu.pojo.Book;
import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LeeYuan on 2016/8/14.
 */
@Service
@Transactional
public class BookService {

    @Autowired
    private BookDao bookDao;

    private int count =1;
    public void testAnno() {
        System.out.println("testAnno");
        System.out.println("service count " + ++count);
    }

    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    public void update(Book book) {
        bookDao.update(book);
    }

    public void delete(Book book) {
        bookDao.delete(book);
    }

    public Book findById(Integer id) {
       return bookDao.findById(id);
    }

    public List<Object> findAll() {
        return bookDao.findAll();
    }

    public List<Object> findByCriteria(DetachedCriteria criteria) {
        return bookDao.findByCriteria(criteria);
    }

    public List findByName(String name) {
        return bookDao.findByName(name);
    }

    public Book findByIdLazy(int id) {
        return bookDao.findByIdLazy(id);
    }

}
