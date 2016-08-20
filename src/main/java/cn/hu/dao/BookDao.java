package cn.hu.dao;

import cn.hu.pojo.Book;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    public void update(Book book) {
        this.getHibernateTemplate().update(book);
    }

    public void delete(Book book) {
        this.getHibernateTemplate().delete(book);
    }

    public Book findById(Integer id) {
        return this.getHibernateTemplate().get(Book.class, id);
    }


    public List<Object> findAll() {
        return this.getHibernateTemplate().find("from Book ");
    }

    public List<Object> findByCriteria(DetachedCriteria criteria) {
        return this.getHibernateTemplate().findByCriteria(criteria);
    }

    public List findByName(String name) {
        return null; //this.getHibernateTemplate().findByNamedQuery("findByName", name);
    }

    public Book findByIdLazy(int id) {
        return this.getHibernateTemplate().load(Book.class, id);
    }
}
