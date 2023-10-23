package lesson_5.homework;

// Сортировка массива с использованием кучи
// Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort).
// Программа должна работать следующим образом:
// Принимать на вход массив целых чисел для сортировки.
// Если массив не предоставлен, программа использует массив по умолчанию.
// Сначала выводить исходный массив на экран.
// Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
// Выводить отсортированный массив на экран.
// Ваше решение должно содержать два основных метода: buildTree, который
// строит сортирующее дерево на основе массива, и heapSort, который выполняет собственно сортировку кучей. Основная часть кода предоставлена вам.
// Программа должна быть способной сортировать массив, даже
// если он состоит из отрицательных чисел и имеет дубликаты.
// На входе:
//  '5 8 12 3 6 9'
// На выходе:
//  Initial array:
//  [5, 8, 12, 3, 6, 9]
//  Sorted array:
//  [3, 5, 6, 8, 9, 12]
import java.util.Arrays;
public class Hw_3 {

    static class HeapSort {
        public static void buildTree(int[] tree, int sortLength) {
            // Введите свое решение ниже
            for (int i = sortLength / 2 - 1; i >= 0; i--) {
                heapify(tree, sortLength, i);
            }

        }

        // heapify метод перестраивает поддерево с корнем в индексе 'node Index', чтобы сформировать a max heap
        public static void heapify(int[] tree, int sortLength, int nodeIndex) {
            int largest = nodeIndex; // Initialize 'largest' as the root
            int leftChild = 2 * nodeIndex + 1; // Left child of 'nodeIndex'
            int rightChild = 2 * nodeIndex + 2; // Right child of 'nodeIndex'

            // Если левый дочерний элемент больше корневого
            if (leftChild < sortLength && tree[leftChild] > tree[largest]) {
                largest = leftChild;
            }

            // Если правый дочерний элемент больше корневого
            if (rightChild < sortLength && tree[rightChild] > tree[largest]) {
                largest = rightChild;
            }

            // Если самый большой не является корневым
            if (largest != nodeIndex) {
                // Поменяйте местами the root с самым большим node
                int temp = tree[nodeIndex];
                tree[nodeIndex] = tree[largest];
                tree[largest] = temp;
                heapify(tree, sortLength, largest);
            }
        }

        public static void heapSort(int[] sortArray, int sortLength) {
            // Введите свое решение ниже
            buildTree(sortArray, sortLength);

            // Извлечение документов
            for (int i = sortLength - 1; i >= 0; i--) {
                // Перемещение наибольшего элемента в конец
                int temp = sortArray[0];
                sortArray[0] = sortArray[i];
                sortArray[i] = temp;

                // Вызов heapify для уменьшения heap
                heapify(sortArray, i, 0);
            }


        }
    }

    // Не удаляйте и не меняйте метод Main!
    public static class Printer {
        public static void main(String[] args) {
            int[] initArray;

            if (args.length == 0) {
                initArray = new int[]{5, 8, 12, 3, 6, 9};
            } else {
                initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            }

            System.out.println("Initial array:");
            System.out.println(Arrays.toString(initArray));
            HeapSort.heapSort(initArray, initArray.length);
            System.out.println("Sorted array:");
            System.out.println(Arrays.toString(initArray));
        }
    }

}
