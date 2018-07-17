package com.sz.bean.com.sz.service.Impl;

import com.sz.bean.com.sz.service.UserService;
import org.springframework.stereotype.Component;


@Component("UserService")
public class UserServiceImpl implements UserService {


    @Override
    public void show() {

        System.out.println("mama is showtime");


    }
}
