package cn.hu.dao;

import cn.hu.pojo.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by LeeYuan on 2016/8/14.
 */
@Repository
public class BookDao extends HibernateDaoSupport {

    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory1) {
        super.setSessionFactory(sessionFactory1);
    }

    public void addBook(Book book) {
        this.getHibernateTemplate().save(book);
    }
}
