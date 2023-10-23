package lesson_2.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

// Сортировка пузырьком с логированием
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
// Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
// int[] arr - числовой массив
// После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt'
// в формате год-месяц-день час:минуты {массив на данной итерации}.
// arr = new int[]{9, 4, 8, 3, 1};
// sort(arr)
//// При чтении лог-файла получим:
// 2023-05-19 07:53 [4, 8, 3, 1, 9]
// 2023-05-19 07:53 [4, 3, 1, 8, 9]
// 2023-05-19 07:53 [3, 1, 4, 8, 9]
// 2023-05-19 07:53 [1, 3, 4, 8, 9]
// 2023-05-19 07:53 [1, 3, 4, 8, 9]

public class Hw_2original {
    static class BubbleSort {
        private static FileWriter fileWriter;

        public static void sort(int[] mas) {
            try {
                File log = new File("log_calc_original.txt");
                //boolean newFile = log.createNewFile();
                fileWriter = new FileWriter(log);
                bubbleSort(mas);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private static void bubbleSort(int[] mas) {
            boolean isSorted = false;
            int buffer;

            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length - 1; i++) {
                    if (mas[i] > mas[i + 1]) {
                        isSorted = false;

                        buffer = mas[i];
                        mas[i] = mas[i + 1];
                        mas[i + 1] = buffer;
                    }
                }
                logStep(Arrays.toString(mas));
            }
            //        return mas;
        }

        public static void logStep(String note){
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                String timestamp = dateFormat.format(new Date());
                fileWriter.write(timestamp + " " + note + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        int[] arr;

        if (args.length == 0) {
            arr = new int[]{9, 4, 8, 3, 1};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

//        BubbleSort ans = new BubbleSort();
        BubbleSort.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log_calc_original.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
