package lesson_1.seminar;

import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file.txt", false);

            try {
                fw.write("line 1");
                fw.append('\n');
                fw.append('2');
                fw.append('\n');
                fw.write("line 3.1");
                fw.flush();
            } catch (Throwable var5) {
                try {
                    fw.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }

                throw var5;
            }

            fw.close();
        } catch (IOException var6) {
            System.out.println(var6.getMessage());
        }

    }
}
