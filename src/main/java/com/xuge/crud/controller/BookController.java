package com.xuge.crud.controller;

import com.xuge.crud.pojo.Books;
import com.xuge.crud.service.BookService;
import com.xuge.crud.uitls.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * author: yjx
 * Date :2022/3/1017:43
 **/
@Controller
@RequestMapping("/book")
public class BookController {
  //调用service层
  @Autowired
  @Qualifier("bookServiceImpl")
  private BookService bookService;
  //查询全部书籍
  @RequestMapping("/list")
  public String list(Model model){
   //1.查询全部书籍
    List<Books> bookList = bookService.queryAllBook();
    model.addAttribute("bookList",bookList);
    return "list";
  }
  //条状到廷加页面
  @RequestMapping("/toAdd")
  public String  toAdd(){
    return "add";
  }
  //跳转到修改页面
  @RequestMapping("/toUpdateBook")
  public String toUpdateBook(Model model,@RequestParam("id") Integer id){
    Books books = bookService.queryBookById(id);
    model.addAttribute("book",books);
    return "updateBook";
  }
  //处理修改请求
  @RequestMapping("/updateBook")
  public String updateBook(Books book){
    bookService.updateBook(book);
    return "redirect:/book/list";
  }


  //添加方法
  @RequestMapping("/addBook")
  public String addBook(Books book){
    bookService.addBook(book);
    return "redirect:/book/list";
  }
  //删除请求
  @RequestMapping("/del/{id}")
  public String delBook(@PathVariable("id")Integer id){
    bookService.deleteBookById(id);
    return "redirect:/book/list";
  }
  @RequestMapping("/queryBook")
  public String queryBook(Model model,String queryBookName){
    List<Books> booksList= bookService.queryBookByName(queryBookName);
    if(StringUtils.isEmpty(queryBookName)){
      model.addAttribute("error","没找到");
      booksList=bookService.queryAllBook();
    }
    model.addAttribute("bookList",booksList);
    return "list";
  }
}
