package com.sz;

import com.sz.entity.Book;
import com.sz.mapper.bookMapper;
import com.sz.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Test2 {

    @Test
    public void  m4(){
        SqlSession sqlSession=MyBatisUtil.createSqlSession();
        bookMapper mapper =sqlSession.getMapper(bookMapper.class);

        Book book=mapper.selectByPrimaryKey(1);

        System.out.println(book);
    }
}
