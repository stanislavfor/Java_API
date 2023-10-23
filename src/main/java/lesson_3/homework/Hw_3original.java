package lesson_3.homework;

import java.util.Arrays;
import java.util.ArrayList;

// Удаление четных элементов
// Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел,
// удаляла бы из него четные числа и выводила список без четных чисел.
// Напишите свой код в методе removeEvenNumbers класса Answer.
// Метод removeEvenNumbers принимает на вход один параметр:
// Integer[] arr - список целых чисел
// Пример:
//  arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//  removeEvenNumbers(arr);
//  [1, 3, 5, 7, 9]
//  arr = new Integer[]{2, 4, 6, 8};
//  removeEvenNumbers(arr);
//  []

public class Hw_3original {

    static class Answer {
        public static void removeEvenNumbers(Integer[] arr) {
            ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
            for (int i = 0; i < ints.size(); i++) {
                if (ints.get(i) % 2 == 0) {
                    ints.remove(i);
                    i--;
                }
            }
            System.out.println(ints);
        }
    }

    public static class Printer{
        public static void main(String[] args) {
            Integer[] arr = {};

            if (args.length == 0) {
                arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            }
            else{
                arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
            }

            Answer ans = new Answer();
            Answer.removeEvenNumbers(arr);
        }
    }

}
