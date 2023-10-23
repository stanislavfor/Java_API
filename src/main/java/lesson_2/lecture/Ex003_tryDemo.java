package lesson_2.lecture;
import java.io.*;

// Работа с файловой системой:
// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения
// файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог

// Работа с файловой системой. Файлы. Ошибки.
//  try {
//      Код, в котором может появиться ошибка
//  } catch (Exception e) {
//      Обработка, если ошибка случилась
//  }
//  finally {
//      Код, который выполнится в любом случае
//  }

public class Ex003_tryDemo {
    public static void main(String[] args) {

        String line = "empty";
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);

            if (file.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("new line");

                //#region lineSeparator
                // A string containing "\r\n" for non-Unix 
                // platforms, or a string containing 
                // "\n" for Unix platforms.
                fileWriter.append(System.lineSeparator());
                //#endregion

                fileWriter.write("new line");
                fileWriter.append("new line");
                fileWriter.flush();
                fileWriter.close();
                // BufferedReader bufReader = new BufferedReader(new FileReader(file));
                // line = bufReader.readLine();
                // bufReader.close();
            }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            System.out.println(line);

        }
    }
}
