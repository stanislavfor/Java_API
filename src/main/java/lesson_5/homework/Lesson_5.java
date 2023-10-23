package lesson_5.homework;

import java.util.*;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что в во входной структуре будут
// повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.
// Формат сдачи:
// файл с расширением java или ссылка на GitHub с подписанными ФИ и номером группы.


public class Lesson_5 {
    public static void main(String[] args) {
        Map<String, List<String>> phonebook = new HashMap<>();

        addPhoneNumber(phonebook, "John", "123-456-7890");
        addPhoneNumber(phonebook, "Alice", "987-654-3210");
        addPhoneNumber(phonebook, "John", "555-123-4567");
        addPhoneNumber(phonebook, "Bob", "555-987-6543");
        addPhoneNumber(phonebook, "Alice", "111-222-3333");
        addPhoneNumber(phonebook, "Alice", "111-222-3773");

        List<Map.Entry<String, List<String>>> sortedPhonebook = new ArrayList<>(phonebook.entrySet());
        sortedPhonebook.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, List<String>> entry : sortedPhonebook) {
            System.out.println("Name: " + entry.getKey());
            System.out.println("Phone Numbers: " + entry.getValue());
        }
    }

    public static void addPhoneNumber(Map<String, List<String>> phonebook, String name, String phoneNumber) {
        phonebook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }


}
