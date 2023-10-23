package lesson_3.homework;

import java.util.Arrays;
import java.util.ArrayList;

public class Hw_3s {

    static class Answer {
        public static Integer[] removeEvenNumbers(Integer[] arr) {
            java.util.List<Integer> oddList = new java.util.ArrayList<>();
            for (Integer num : arr) {
                if (num % 2 != 0) {
                    oddList.add(num);
                }
            }
            Integer[] oddArray = new Integer[oddList.size()];
            oddArray = oddList.toArray(oddArray);
            return oddArray;
        }

        public static void main(String[] args) {
            Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            Integer[] result1 = removeEvenNumbers(arr);
            System.out.print("arr = new Integer[]{");
            Printer.printArray(arr);
            System.out.println("removeEvenNumbers;");
            System.out.print("Result: ");
            Printer.printArray(result1);

        }
    }

    static class Printer {
        public static void printArray(Integer[] arr) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("]");
        }
    }



}
