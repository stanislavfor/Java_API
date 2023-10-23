package lesson_3.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Задача 3. Анализатор спмска
// Напишите функцию analyzeNumbers, котораяпринимает на вход целочисленный список arr и:
// Сортирует его по возрастанию и выводит на экран
// Находит минимальное значение в списке и выводит на экран -
// Minimum is {число}
// Находит максимальное значение в списке и выводит на экран -
// Maximum is {число}
// Находит среднее фрифметическое значение списка и выводит на экран -
// Average is {число}

public class Hw_4 {

    static class Printer {
        public static void printMin(int min) {
            System.out.println("Minimum is " + min);
        }
        public static void printMax(int max) {
            System.out.println("Maximum is " + max);
        }
        public static void printAverage(double average) {
            System.out.println("Average is " + average);
        }
    }

    static class Answer {
        public static void analyzeNumbers(List<Integer> arr) {
            Collections.sort(arr);
            System.out.println("Sorted list: " + arr);
            int min = arr.get(0);
            Printer.printMin(min);
            int max = arr.get(arr.size() - 1);
            Printer.printMax(max);
            double sum = 0;
            for (int number : arr) {
                sum += number;
            }
            double average = sum / arr.size();
            Printer.printAverage(average);
        }

        public static void main(String[] args) {
            List<Integer> arr = new ArrayList<>();
            arr.add(5);
            arr.add(3);
            arr.add(7);
            arr.add(1);
            arr.add(9);

            analyzeNumbers(arr);
        }
    }

}
