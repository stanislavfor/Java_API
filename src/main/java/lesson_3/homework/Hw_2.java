package lesson_3.homework;

import java.util.Arrays;

// Задача 1. Сортировка слияния
// Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел a и результат реализует алгоритм сортировки. Метод должен возвращать отсортированный массив.
// Пример:
// a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

public class Hw_2 {

    public static class MergeSort {
        public static int[] mergeSort(int[] a) {
            if (a.length <= 1) {
                return a;
            }
            int mid = a.length / 2;
            int[] left = Arrays.copyOfRange(a, 0, mid);
            int[] right = Arrays.copyOfRange(a, mid, a.length);
            left = mergeSort(left);
            right = mergeSort(right);
            return merge(left, right);
        }

        private static int[] merge(int[] left, int[] right) {
            int[] result = new int[left.length + right.length];
            int leftIndex = 0, rightIndex = 0, resultIndex = 0;
            while (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex] < right[rightIndex]) {
                    result[resultIndex++] = left[leftIndex++];
                } else {
                    result[resultIndex++] = right[rightIndex++];
                }
            }
            while (leftIndex < left.length) {
                result[resultIndex++] = left[leftIndex++];
            }
            while (rightIndex < right.length) {
                result[resultIndex++] = right[rightIndex++];
            }
            return result;

        }

        public static void main(String[] args) {
            int[] a = {5, 1, 6, 2, 3, 4};
            int[] itresume_res = mergeSort(a);

            Printer.printSortedArray(itresume_res);
        }
    }

    static class Printer {
        public static void printSortedArray(int[] sortedArray) {


            System.out.println("Sorted array: " + Arrays.toString(sortedArray));
        }
    }

}
