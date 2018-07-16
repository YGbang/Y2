package com.sz.old.test;

import com.sz.old.bean.Girl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {


   @Test
   public void m1(){
       ApplicationContext context=new ClassPathXmlApplicationContext
               (new String[]{"app1.xml"});

       Girl g=(Girl) context.getBean("goodgirl");
       System.out.println(g);
   }






}
