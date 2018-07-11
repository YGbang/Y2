package com.sz.mapper;

import com.sz.entity.Book;
import com.sz.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface bookMapper {
    List<Book> listAll();//查询所有信息
    int insertBook(Book book);//新增图书信息
    int updateBookById(@Param("name") String name, @Param("id") Integer id);
    int deleteBookById(@Param("id") Integer id);


    /**
     * 动态sql
     * @param b
     * @return
     */
    int  inserTive(Book b);


}
