package com.sz;

import com.sz.bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {


    @Test

    public void m1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc.xml");
        Book book= (Book) ctx.getBean("book");
        Book book1 = (Book) ctx.getBean("book");
        System.out.println(book == book1);

        Book book2 = new Book();
        System.out.println(book2);

        Book b1= (Book) ctx.getBean("book2");
        Book b2= (Book) ctx.getBean("book2");

        System.out.println(b1 == b2);

        // ((ClassPathXmlApplicationContext) ctx).destroy();
         ((ClassPathXmlApplicationContext) ctx).close();


    }
}
