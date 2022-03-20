package com.xuge.crud.uitls;

/**
 * author: yjx
 * Date :2022/3/1021:28
 **/
public class StringUtils {
  //判断字符串为空且为null
  public static Boolean isEmpty(String str){
    if(str==null||"".equals(str)){
      return true;
    }
    return false;
  }
  public static Boolean isNotEmpty(String str){
    return !isEmpty(str);
  }
}
