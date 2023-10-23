package lesson_1.seminar;

import java.io.FileWriter;
import java.io.IOException;

// Работа с файлами
// Создание и запись (дозапись)

public class Main {  

 public static void main(String[] args) {

  try (FileWriter fw = new FileWriter("file.txt", false))
  {
   fw.write("line 1");
   fw.append('\n');
   fw.append('2');
   fw.append('\n');
   fw.write("line 3.1");
   fw.flush();
  } catch (IOException ex)
  {
   System.out.println(ex.getMessage());
  }
 }
}



