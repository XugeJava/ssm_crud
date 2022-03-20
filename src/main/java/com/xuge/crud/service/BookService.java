package com.xuge.crud.service;

import com.xuge.crud.pojo.Books;

import java.util.List;

/**
 * author: yjx
 * Date :2022/3/1016:58
 **/
public interface BookService {
  //增加一个Book
  int addBook(Books book);
  //根据id删除一个Book
  int deleteBookById(int id);
  //更新Book
  int updateBook(Books books);
  //根据id查询,返回一个Book
  Books queryBookById(int id);
  //查询全部Book,返回list集合
  List<Books> queryAllBook();
  //通过书本名称查询
  List<Books> queryBookByName(String bookName);
}
