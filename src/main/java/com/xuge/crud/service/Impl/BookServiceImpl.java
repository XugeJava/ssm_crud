package com.xuge.crud.service.Impl;

import com.xuge.crud.mappers.BookMapper;
import com.xuge.crud.pojo.Books;
import com.xuge.crud.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: yjx
 * Date :2022/3/1016:59
 **/
@Service
public class BookServiceImpl implements BookService {
  @Autowired
  private BookMapper bookMapper;
  @Override
  public int addBook(Books book) {
    return bookMapper.insertBook(book);
  }

  @Override
  public int deleteBookById(@Param("id")int id) {
    return bookMapper.delBook(id);
  }

  @Override
  public int updateBook(Books books) {
    return bookMapper.updateBook(books);
  }

  @Override
  public Books queryBookById(@Param("id")int id) {
    return bookMapper.queryBookById(id);
  }

  @Override
  public List<Books> queryAllBook() {
    return bookMapper.queryAllBook();
  }

  @Override
  public List<Books> queryBookByName(String bookName) {
    return bookMapper.quertBookByName(bookName);
  }
}
