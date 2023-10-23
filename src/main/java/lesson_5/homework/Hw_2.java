package lesson_5.homework;

// Подсчет повторяющихся имен
// Вы работаете с приложением для учета имен пользователей. Ваша задача - разработать программу, которая принимает на вход пять имен пользователей (или использует имена по умолчанию, если аргументы не предоставлены) и подсчитывает, сколько раз каждое имя встречается.
//Программа должна использовать HashMap для хранения имен и их количества вхождений.
//По завершении, программа выводит результат в виде пар "имя - количество".
// На входе:
//  'Elena'
//  'Elena'
//  'Elena'
//  'Ivan'
//  'Ivan'
// На выходе:
//  {Ivan=2, Elena=3}

import java.util.HashMap;
public class Hw_2 {


    static class NamesCounter {
        private final HashMap<String, Integer> names = new HashMap<>();

        // Метод для добавления имени в HashMap
        public void addName(String name) {
            // Введите свое решение ниже
            if (names.containsKey(name)) {
                // If it is, increment the count
                names.put(name, names.get(name) + 1);
            } else {
                // If it's not, add it with a count of 1
                names.put(name, 1);
            }

        }

        // Метод для вывода содержимого HashMap
        public void showNamesOccurrences() {
            // Введите свое решение ниже
            System.out.println(names);
        }
    }

    // Не удаляйте и не меняйте метод Main!
    public static class Printer {
        public static void main(String[] args) {
            String name1;
            String name2;
            String name3;
            String name4;
            String name5;

            if (args.length == 0) {
                name1 = "Elena";
                name2 = "Elena";
                name3 = "Elena";
                name4 = "Elena";
                name5 = "Ivan";
            } else {
                name1 = args[0];
                name2 = args[1];
                name3 = args[2];
                name4 = args[3];
                name5 = args[4];
            }
            NamesCounter namesCounter = new NamesCounter();

            namesCounter.addName(name1);
            namesCounter.addName(name2);
            namesCounter.addName(name3);
            namesCounter.addName(name4);
            namesCounter.addName(name5);

            namesCounter.showNamesOccurrences();
        }
    }
}
