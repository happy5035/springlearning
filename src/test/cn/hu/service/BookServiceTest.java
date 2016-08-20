package cn.hu.service;

import cn.hu.pojo.Book;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by LeeYuan on 2016/8/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Autowired
    private Book book;

    @Test
    public void addBook() throws Exception {

    }

    @Test
    public void update() throws Exception {
        Book book = new Book();
        book.setName("spring mvc");
        book.setPrice(10.0);
        book.setId(11);
        bookService.update(book);
    }

    @Test
    public void delete() throws Exception {

        Book book = new Book();
        book.setName("spring mvc");
        book.setPrice(10.0);
        book.setId(11);
        bookService.delete(book);
    }

    @Test
    public void findById() throws Exception {
        Integer id = new Integer(10);
        Book book = bookService.findById(id);
//        assertEquals("equals",new Integer(2), book.getId());
        System.out.println(book);
    }

    @Test
    public void findAll() throws Exception {
        List<Object> books = bookService.findAll();

        System.out.println(books);
    }

    @Test
    public void findByCriteria() {
        DetachedCriteria criteria = DetachedCriteria.forClass(Book.class);
        criteria.add(Restrictions.eq("name", "232"));
        List books = bookService.findByCriteria(criteria);
        System.out.println(books);

    }

    @Test
    public void findByName() {
        List books = bookService.findByName("232");
        System.out.println(books);
    }

    @Test
    public void findByIdLazy() {
        Book book = bookService.findByIdLazy(2);
//        System.out.println(book);
    }


    @Test
    public void test() {
        Man man = new Man();
        People people = new People();
        man.setName("zhangsan");
        man.setAge("23");
        System.out.println((People)man);
    }

}