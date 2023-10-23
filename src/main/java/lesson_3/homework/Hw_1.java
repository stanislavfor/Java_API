package lesson_3.homework;

//import java.io.*;
import java.util.*;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Iterator;
//import java.util.List;
import java.util.Random;

// Пусть дан произвольный список целых чисел
// 1) Нужно удалить из него четные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

public class Hw_1 {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        Iterator<Integer> iterator = numbers.iterator();

        int number;
        while (iterator.hasNext()) {
            number = (int) iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println("Min number = " + numbers.get(0));
        System.out.println("Max number = " + numbers.get(numbers.size() - 1));

        // ArrayList's String to Intenger:
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer s: numbers) {
            newList.add(Integer.parseInt(String.valueOf(s)));
        }
        System.out.println("newList: " + newList);

        double sums = 0;
        for (int x: newList) {
            sums += x;
        }
        System.out.println("кол-во элементов newList: " + newList.size());
        System.out.println("среднее арифметическое чисел равно: " + sums/(newList.size()));

//        // Пример:
//        int newList_1 [] = {1, 2, 3, 4, 5};
//        double sum = 0;
//        for (int x: newList_1) {
//            sum += x;
//        }
//        System.out.println("[1, 2, 3, 4, 5]");
//        System.out.println("кол-во элементов newList_1: " + newList_1.length);
//        System.out.println("среднее арифметическое чисел равно: " + sum / newList_1.length);


//        String to Intenger:
//        String str = "-123";
//        int n = Integer.decode(str).intValue();
//        System.out.println(n);

    }

}
