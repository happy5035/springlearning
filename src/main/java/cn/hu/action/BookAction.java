package cn.hu.action;

import cn.hu.pojo.Book;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by LeeYuan on 2016/8/14.
 */
public class BookAction extends ActionSupport implements ModelDriven<Book> {

    private Book book = new Book();
    public Book getModel() {
        return book;
    }

    public String add() {
        System.out.println("add....");
        return null;
    }
}
