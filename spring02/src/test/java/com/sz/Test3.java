package com.sz;

import com.sz.bean.com.sz.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    @Test

    public void m1() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation.xml");


        UserService userService= (UserService) ctx.getBean("userService");

        userService.show();




    }
}
