package lesson_3.seminar;

import java.util.*;

public class L_3x006 {
// 1. Написать интерфейс текстового ввода ФИО возраст и пол
    public static class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

// 2. Реализовать ввод для неограниченного количества человек,
// добавить выход из режима по команде exit.
// Вывести список введённых данных в формате Иванов И.И. в порядке ввода.

            String input = "";
            String userData = "";
            System.out.println("Введите Ваши данные (ФИО, возраст, пол): ");
            System.out.println("Для выхода введите 'exit'");
            List<String> myList = new ArrayList<>();
            do {
                input = sc.nextLine();
                if (!input.equals("exit")) {
                    myList.add(input);
                }
            } while (!input.equals("exit"));
// 3. вывести отсортированными по возрасту в формате "Иванов И.И. 16 м"

            myList.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String[] s1 = o1.split(", ");
                    String[] s2 = o2.split(", ");
                    int i1 = Integer.parseInt(s1[1]);
                    int i2 = Integer.parseInt(s2[1]);
                    return (i1 - i2);
                }
            });
            myList.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String[] s1 = o1.split(", ");
                    String[] s2 = o2.split(", ");
                    String i1 = s1[2];
                    String i2 = s2[2];
                    return (i1.compareTo(i2));
                }
            }); // Отсортировать по возрасту и полу
            myList.forEach(System.out::println); // Вывести данные в новой строке
            sc.close();
        }
    }

}

// Сергеев Семен Иванович 19 м
// Морозова Марина Игоревна 52 ж
// Снегирева Ирина Игоревна 45 ж
// Петров Сергей Николаевич 30 м
// Чижов Николай Владимирович 25 ж
// Васильев Артур Геннадьевич 38 м
// Кучерянкина Роза Фердипёкловна 99 ж



