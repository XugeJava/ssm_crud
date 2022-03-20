package com.xuge.crud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * author: yjx
 * Date :2022/3/1016:39
 **/

public class Books {
  private Integer bookId;
  private String bookName;
  private Integer bookCounts;
  private String detail;

  public Books(Integer bookId) {
    this.bookId = bookId;
  }

  public Books() {
  }

  public Books(Integer bookId, String bookName, Integer bookCounts, String detail) {
    this.bookId = bookId;
    this.bookName = bookName;
    this.bookCounts = bookCounts;
    this.detail = detail;
  }

  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public Integer getBookCounts() {
    return bookCounts;
  }

  public void setBookCounts(Integer bookCounts) {
    this.bookCounts = bookCounts;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  @Override
  public String toString() {
    return "Books{" +
            "bookId=" + bookId +
            ", bookName='" + bookName + '\'' +
            ", bookCounts=" + bookCounts +
            ", detail='" + detail + '\'' +
            '}';
  }
}
