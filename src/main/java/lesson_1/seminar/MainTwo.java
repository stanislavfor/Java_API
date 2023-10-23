package lesson_1.seminar;

import java.io.FileReader;

// Работа с файлами
// Чтение, Вариант посимвольно

public class MainTwo {
  public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("file.txt");
    int c;
    while ((c = fr.read()) != -1) {
      char ch = (char) c;
      if (ch == '\n') {
        System.out.print(ch);
      } else {
        System.out.print(ch);
      }
    }
  }
}
