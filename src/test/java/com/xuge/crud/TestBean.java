package com.xuge.crud;

import com.xuge.crud.mappers.BookMapper;
import com.xuge.crud.pojo.Books;
import com.xuge.crud.service.BookService;
import com.xuge.crud.service.Impl.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * author: yjx
 * Date :2022/3/1019:39
 **/
public class TestBean {
  @Test
  public void test(){
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    BookService bookService= context.getBean("bookServiceImpl", BookService.class);
    System.out.println(bookService.queryAllBook());
    //2.测试BookMapper
    BookMapper bookMapper = context.getBean("bookMapper", BookMapper.class);
    List<Books> books = bookMapper.queryAllBook();
    books.forEach(books1 -> System.out.println(books1));
  }
}
