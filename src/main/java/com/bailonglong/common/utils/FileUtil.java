/**
 * Create Date:2019年10月24日
 */
package com.bailonglong.common.utils;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:柏龙龙
 * <br>Date:2019年10月24日
 */
public class FileUtil {
  /*
  * 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
  */
  public static String getExtendName(String fileName){
    int lastIndexOf = fileName.lastIndexOf(".");
    
    String substring = fileName.substring(lastIndexOf);
    
    return substring;
  }
}
