package lesson_4.seminar;

// Задание 1. Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом.

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class L_4x001 {
    public static boolean isPalindrome(String input) {
        String cleanInput = input.replaceAll("[^0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : cleanInput.toCharArray()) {
            deque.add(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //String input = "12321";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность чисел для проверки Палиндрома: ");
        String input = scanner.nextLine();

        boolean isPalindrome = isPalindrome(input);
        System.out.print("Эта последовательность ");
        if (isPalindrome) {
            System.out.println(input + " является палиндромом.");
        } else {
            System.out.println(input + " - не палиндром.");
        }
        System.out.println(isPalindrome(input));
    }
}
