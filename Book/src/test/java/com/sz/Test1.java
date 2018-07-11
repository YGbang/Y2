package com.sz;

import com.sz.entity.Book;
import com.sz.mapper.bookMapper;
import com.sz.utils.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test1 {


    @Test
    public void m1(){
        // 1 定义mybatis核心配置文件的位置
        String resource = "mybatis-cfg.xml";
        // 2 通过mybatis的工具类加载这个文件为输入流
        InputStream in = null;
        SqlSessionFactory sessionFactory = null;
        SqlSession sqlSession = null;
        try {
            in = Resources.getResourceAsStream(resource);
            // 3 创建一个会话工厂  会话工厂的建造者（一次性用品）
            sessionFactory = new SqlSessionFactoryBuilder().build(in);
            // 4 利用工厂生产会话
            sqlSession = sessionFactory.openSession();
            // 5 使用会话进行相关的操作

            // 得到一个Mapper，mybatis本身通过动态代理帮我们去创建实例
            bookMapper mapper = sqlSession.getMapper(bookMapper.class);
            //
            List<Book> books = mapper.listAll();
            System.out.println(books);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void m2(){
        SqlSession sqlSession = MyBatisUtil.createSqlSession();
        bookMapper mapper=sqlSession.getMapper(bookMapper.class);
        List<Book> books=mapper.listAll();
        System.out.println(books);

        if(sqlSession==null){
            sqlSession.close();
        }


    }

    @Test
    public void  testByIntsert(){//新增
        SqlSession sqlSession = null;
        int count=-1;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            Book book=new Book();
            book.setISBN("999-121");
            book.setName("javascript");
            book.setPrice(100);
            book.setDiscount(0.5);
            book.setPublisher("福田出版社");
            //调用getMapper(Mapper.class)执行dao接口方法来实现对数据库的查询操作
            count = sqlSession.getMapper(bookMapper.class).insertBook(book);
            if(count==1){
                System.out.println("添加成功！");
            }
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            MyBatisUtil.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void  updateBookById(){//修改
        SqlSession sqlSession = null;
        int count=-1;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            String name="java";
            int id=1;
            //调用getMapper(Mapper.class)执行dao接口方法来实现对数据库的查询操作
            count = sqlSession.getMapper(bookMapper.class).updateBookById(name,id);
            if(count==1){
                System.out.println("更改成功！");
            }
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            MyBatisUtil.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void  deleteBookById(){//删除
        SqlSession sqlSession = null;
        int count=-1;
        try {
            sqlSession = MyBatisUtil.createSqlSession();
            int id=1;
            //调用getMapper(Mapper.class)执行dao接口方法来实现对数据库的查询操作
            count = sqlSession.getMapper(bookMapper.class).deleteBookById(id);
            if(count==1){
                System.out.println("删除成功！");
            }
            sqlSession.commit();
        } catch (Exception e) {
            sqlSession.rollback();
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            MyBatisUtil.closeSqlSession(sqlSession);
        }
    }

    @Test
    public void m3(){

        SqlSession sqlSession=MyBatisUtil.createSqlSession();
        bookMapper mapper =sqlSession.getMapper(bookMapper.class);
        Book b=new Book();
        b.setId(1);
        mapper.inserTive(b);
        sqlSession.commit();
        sqlSession.close();

    }


}


