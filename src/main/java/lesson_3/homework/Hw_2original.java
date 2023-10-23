package lesson_3.homework;

import java.util.Arrays;

// Задача 1. Сортировка слияния
// Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел a и результат реализует алгоритм сортировки. Метод должен возвращать отсортированный массив.
// Пример:
// a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

public class Hw_2original {

    static class MergeSort {
        public static int[] mergeSort(int[] a) {
            int n = a.length;
            if (n < 2) {
                return a;
            }
            int mid = n / 2;
            int[] l = new int[mid];
            int[] r = new int[n - mid];

            System.arraycopy(a, 0, l, 0, mid);
            if (n - mid >= 0) System.arraycopy(a, mid, r, 0, n - mid);
            l = mergeSort(l);
            r = mergeSort(r);

            return merge(l, r);
        }

        public static int[] merge(int[] l, int[] r) {

            int left = l.length;
            int right = r.length;
            int[] a = new int[left + right];
            int i = 0, j = 0, k = 0;

            while (i < left && j < right) {
                if (l[i] <= r[j]) {
                    a[k++] = l[i++];
                }
                else {
                    a[k++] = r[j++];
                }
            }
            while (i < left) {
                a[k++] = l[i++];
            }
            while (j < right) {
                a[k++] = r[j++];
            }

            return a;
        }
    }

    public static class Printer{
        public static void main(String[] args) {
            int[] a;

            if (args.length == 0) {
                a = new int[]{5, 1, 6, 2, 3, 4};
            } else {
                a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            }

            MergeSort answer = new MergeSort();
            String itresume_res = Arrays.toString(MergeSort.mergeSort(a));
            System.out.println(itresume_res);
        }
    }

}
