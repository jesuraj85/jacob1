package Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;

public class MyClass {
  public MyClass() {
  }
  public static void main(String[] args) {
    MyClass myClass1 = new MyClass();

    String result = myClass1.readFile("file.txt");

    myClass1.print("--- for test ---");
  }

  /**
   * this method is used to read file
   * @param fileName
   * @return
   */
  public String readFile(String fileName) {
    File f;
    FileReader in = null;
    StringBuffer sb = new StringBuffer();

    try {
      f = new File(fileName);
      in = new FileReader(f);
      char[] buffer = new char[4096];
      int len;

      while ( (len = in.read(buffer)) != -1) {
        String s = new String(buffer, 0, len);
        sb.append(s);
      }
      System.out.print("The file is:");
      System.out.println(sb.toString());
    }
    catch (IOException ex) {
//      ex.printStackTrace();
      return null;
    }

    return sb.toString();
  }

  public void print(String s) {
    System.out.println(s);
  }

}