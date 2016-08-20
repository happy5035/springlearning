package cn.hu.action;

import cn.hu.pojo.Book;
import cn.hu.service.BookService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created by LeeYuan on 2016/8/14.
 */
@Namespace("/")
@ParentPackage("struts-default")
@Controller
@Scope("prototype")
public class BookAction extends ActionSupport implements ModelDriven<Book> {

    private Book book = new Book();

    public Book getModel() {
        return book;
    }

    private int count = 1;
    @Autowired
    private BookService bookService;


    public String test() {
        System.out.println("add.......");
        bookService.testAnno();
        System.out.println(++count);
        return null;
    }

    @Action("book_add")
    public String add() {

        bookService.addBook(book);
        return null;
    }
}
