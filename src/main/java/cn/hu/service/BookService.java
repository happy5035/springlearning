package cn.hu.service;

import cn.hu.dao.BookDao;
import cn.hu.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
