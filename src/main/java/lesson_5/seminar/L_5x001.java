package lesson_5.seminar;

//import java.util.*;
import java.util.HashMap;
import java.util.Map;

// Задание 1. Дана последовательность чисел. Необходимо вернуть сумму уникальных чисел
// Пример: [1, 2, 2, 3]
// Результат: 4

public class L_5x001 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3};
        int sumOfUniqueNumbers = sumOfUniqueNumbers(numbers);
        System.out.println("Sum of unique numbers: " + sumOfUniqueNumbers);
    }

    public static int sumOfUniqueNumbers(int[] numbers) {
        Map<Integer, Integer> numberCount = new HashMap<>();

        // Count the occurrences of each number in the array
        for (int num : numbers) {
            numberCount.put(num, numberCount.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

        // Sum the unique numbers
        for (int num : numbers) {
            if (numberCount.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }
}
