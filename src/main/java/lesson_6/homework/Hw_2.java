package lesson_6.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hw_2 {
    static class PhoneBook {
        private final HashMap<String, List<Integer>> phoneBook = new HashMap<>();

        public void add(String name, Integer phoneNum) {
            // Проверяем существует ли уже это имя в телефонной книге
            if (phoneBook.containsKey(name)) {
                List<Integer> phoneList = phoneBook.get(name);
                phoneList.add(phoneNum);
            } else {
                List<Integer> phoneList = new ArrayList<>();
                phoneList.add(phoneNum);
                phoneBook.put(name, phoneList);
            }
        }

        public List<Integer> find(String name) {
            return phoneBook.getOrDefault(name, new ArrayList<>());
        }

        public Map<String, List<Integer>> getPhoneBook() {
            // Сорируем в порядке убывания количества телефонов
            return phoneBook.entrySet()
                    .stream()
                    .sorted((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, HashMap::new));
        }
    }

    public static class PhoneBookApp {
        public static void main(String[] args) {
            PhoneBook myPhoneBook = new PhoneBook();

            myPhoneBook.add("Alice", 123456789);
            myPhoneBook.add("Bob", 987654321);
            myPhoneBook.add("Alice", 987654321);
            myPhoneBook.add("Charlie", 111111111);
            myPhoneBook.add("Alice", 555555555);
            myPhoneBook.add("David", 585555555);
            myPhoneBook.add("David", 558875555);

            System.out.println("Contacts:");
            Map<String, List<Integer>> phoneBook = myPhoneBook.getPhoneBook();

            phoneBook.forEach((name, phoneNum) -> System.out.println(name + " - " + phoneNum));
//            phoneBook.forEach((name, phones) -> System.out.println(name + " - " + myPhoneBook.find(name)));


        }
    }



}
