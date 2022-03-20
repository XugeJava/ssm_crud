package com.xuge.crud.mappers;

import com.xuge.crud.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * author: yjx
 * Date :2022/3/1016:46
 **/
public interface BookMapper {
  //增加一本书
  int insertBook(Books book);
  //删除一本书
  int delBook(@Param("id")Integer id);
  //修改一本书
  int updateBook(Books book);
  //查询一本书
  Books queryBookById(@Param("id")Integer id);
  //查询全部书
  List<Books> queryAllBook();
  //通过书本名称进行查询
  List<Books> quertBookByName(@Param("bookName")String bookName);
}
