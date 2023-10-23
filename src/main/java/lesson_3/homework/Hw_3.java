package lesson_3.homework;

// Задача 2. Удаление чётных элементов
// Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел,
// удаляла бы из него четные числа и выводила список без четных чисел.
// Напишите свой код в методе removeEvenNumbers класса Answer.
// Метод removeEvenNumbers принимает на вход один параметр:
// integer[]arr - список целых чисел.
// Пример:
//  arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//  removeEvenNumbers(arr);
//  [1 3 5 7 9 ]
//  arr = new Integer[]{2, 4, 6, 8};
//  removeEvenNumbers(arr);
// []


public class Hw_3 {
    public static class Answer {
        public static Integer[] removeEvenNumbers(Integer[] arr) {
            int oddCount = 0;
            for (int number : arr) {
                if (number % 2 != 0) {
                    oddCount++;
                }
            }

            Integer[] oddNumbers = new Integer[oddCount];
            int index = 0;
            for (int number : arr) {
                if (number % 2 != 0) {
                    oddNumbers[index] = number;
                    index++;
                }
            }

            return oddNumbers;
        }

        public static void main(String[] args) {
            Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            Integer[] result = removeEvenNumbers(arr);

            System.out.println("Original array:");
            for (int number : arr) {
                System.out.print(number + " ");
            }

            System.out.println("\nArray without even numbers:");
            for (int number : result) {
                System.out.print(number + " ");
            }
        }
    }

}
