package lesson_4.lecture;

import java.util.*;

public class Ex004 {
    public static void main(String[] args) {
        // В Java в основном существует 5 методов класса стека.
        Stack<Integer> stack = new Stack<>();
        // push() - Ставит элемент в верх стека
        // peek() - Рассматривает объект стека, не удаляя его
        // pop() - Удаляет объект из стека
        // empty() - Проверяет, пуст ли стек
        // search() - Поиск элемента для получения его индекса

        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println("stack = " + stack.peek());
        System.out.println("stack.empty() -> " + stack.empty());
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1

        System.out.println("stack.empty() -> " + stack.empty());
        System.out.println("stack.search(0) = " + stack.search(0));
    }
}
