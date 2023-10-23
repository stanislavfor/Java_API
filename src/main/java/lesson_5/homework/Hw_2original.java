package lesson_5.homework;

import java.util.HashMap;

public class Hw_2original {
    static class NamesCounter {
        private final HashMap<String, Integer> names = new HashMap<>();

        // Метод для добавления имени в HashMap
        public void addName(String name) {
            if (names.containsKey(name)) {
                names.put(name, names.get(name) + 1);
            } else {
                names.put(name, 1);
            }
        }

        // Метод для вывода содержимого HashMap
        public void showNamesOccurrences() {
            System.out.println(names);
        }
    }

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
