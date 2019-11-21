/**
 * Create Date:2019年10月24日
 */
package com.bailonglong.common.utils;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:柏龙龙
 * <br>Date:2019年10月24日
 */
public class StreamUtil {
  
  /*
  * 方法1：批量关闭流，参数能传入无限个。(10分)
  * 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
  */
  public static void closeAll(Closeable... io) {
    for (Closeable temp : io) {
      try {
        if (null != temp)
          temp.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  /*
  * 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
  */

  public static String readTextFile(InputStream src) throws Exception {
    byte[] b = new byte[1024];
    int len = 0;
    String string = null;
    while((len = src.read(b)) != -1 ) {
      string = new String(b);
    }
    StreamUtil.closeAll(src);
    return string;
  }

  /*
  * 方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
  */
  public static String readTextFile(File txtFile) throws Exception {

   InputStream fileInputStream = new FileInputStream(txtFile);
   
   String readTextFile = StreamUtil.readTextFile(fileInputStream);
   
   StreamUtil.closeAll(fileInputStream);
    return readTextFile;
  }
 
}
