package lesson_2.homework;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;
import java.util.stream.IntStream;


// Задача 2. Реализуйте алгоритм сортировки пузырьком числового массива,
//    результат после каждой итерации запишите в лог-файл.

public class Hw_2 {
    private static final Logger logger = Logger.getLogger(Hw_2.class.getName());

    public static void main(String[] args) throws IOException {

        // int[] arr = {[50, 17, 24, 74, 63, 95, 97, 42]};

        int size = 8;
        int upperBound = 100;
        int[] arr = new int[size];
        Random random = new Random();
        IntStream.range(0, size).forEach(index -> arr[index] = random.nextInt(upperBound));
//        System.out.print(Arrays.toString(arr)); // example: [50, 17, 24, 74, 63, 95, 97, 42]

        Logger logger = Logger.getLogger(Logger.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("logger_sorting.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info("итерации шаг: 0 исходный массив: " + Arrays.toString(arr));
        sorting(arr);
        logger.info("итерации шаг: " + (arr.length) + " отсортированный массив: " + Arrays.toString(arr));
    }
    public static int sorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
//            logger.info("Промежуточный результат -> ");

            logger.info( "итерации шаг: " + (i+1) + " промежуточный результат: " +  Arrays.toString(arr));

        }
        return arr.length+1;
    }
}
