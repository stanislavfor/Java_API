package lesson_2.seminar;

//import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class L_2x001 {
    public static void main(String[] args) {

        int k = 0;
        try {
            // Вывод в файл
            FileWriter writer = new FileWriter("text.txt", true);
            writer.write("Привет, Мир");
            writer.append("!");
            writer.append(" ");
            writer.close();

            // Вывод в консоли
            FileReader reader = new FileReader("text.txt");
            while (reader.ready()){
                System.out.print((char) reader.read());
            }
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
