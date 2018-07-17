package com.sz;

import com.sz.bean.Book;
import com.sz.bean.Girl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test2 {

    @Test
    public void m1(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ioc-collections.xml");

       // Girl girl = ctx.getBean("girl",Girl.class);
       // System.out.println(Arrays.toString(girl.getFriends()));

        Girl girl = ctx.getBean("gir2",Girl.class);
        System.out.println(girl.getNos());


        Girl girl2 = ctx.getBean("gir3",Girl.class);
        System.out.println(girl2.getBooks());

        Girl girl3 = ctx.getBean("gir4",Girl.class);
        System.out.println(girl3.getFavorateFoods().get("f01").getName());







    }
    @Test
    public void m2(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");


        Girl girl3 = ctx.getBean("gir4",Girl.class);
        System.out.println(girl3.getFavorateFoods().get("f01").getName());

        Book b=ctx.getBean("b10",Book.class);
        System.out.println(b);


    }
}
