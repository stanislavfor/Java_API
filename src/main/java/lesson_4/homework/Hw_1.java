package lesson_4.homework;

// Задача 1. Перевернутый LinkedList
// Пусть дан LinkedList с несколькими элементами.
// Напишите класс LLTasks с методом revert, который принимал бы на вход LinkedList и возвращает “перевернутый” список.
// Пример:
//   Дан
//   [1, One, 2, Two]
//   Вывод
//  [1, One, 2, Two]
//  [Two, 2, One, 1]

import java.util.LinkedList;

public class Hw_1{
    static class LLTasks {
        public static LinkedList<Object> revert(LinkedList<Object> ll) {
            // Напишите свое решение ниже
        //        System.out.println("Hello, ...");
            LinkedList<Object> reversed = new LinkedList<Object>();

            for (Object item : ll) {
                reversed.addFirst(item);
            }
        //        System.out.println(reversed);
            return reversed;

        }

    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static class Printer{
        public static void main(String[] args) {
            LinkedList<Object> ll = new LinkedList<>();

            if ((args.length == 0) || (args.length != 4)) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                ll.add(1);
                ll.add("One");
                ll.add(2);
                ll.add("Two");
            } else {
                ll.add(Integer.parseInt(args[0]));
                ll.add(args[1]);
                ll.add(Integer.parseInt(args[2]));
                ll.add(args[3]);
            }

            LLTasks answer = new LLTasks();
//            System.out.println("Hello, ...");

//            System.out.println(ll);
            System.out.println(ll);
            LinkedList<Object> reversedList = LLTasks.revert(ll);
            System.out.println(reversedList);
        }
    }
}

