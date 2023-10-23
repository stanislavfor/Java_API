package lesson_6.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hw_5 {
    public static void main(String[] args) {
        // Создание HashMap для хранения записей телефонной книги, где имя и фамилия являются ключами
        Map<String, String> phonebook = new HashMap<>();

        try {
            // Считывание данных из текстового файла (формат файла "name surname phoneNumber")
            BufferedReader reader = new BufferedReader(new FileReader("phonesbook.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 3) {
                    String name = parts[0];
                    String surname = parts[1];
                    String phoneNumber = parts[2];

                    // Создание ключа, имя и фамилия, чтобы идентифицировать запись
                    String key = name + " " + surname;

                    // Check if the entry already exists in the phonebook
                    if (phonebook.containsKey(key)) {
                        // Обновление запись новым номером телефона
                        String existingPhoneNumber = phonebook.get(key);
                        phonebook.put(key, existingPhoneNumber + ", " + phoneNumber);
                    } else {
                        // Создание новую запись в телефонной книге
                        phonebook.put(key, phoneNumber);
                    }
                }
            }
            reader.close();

            // Создаем список записей для сортировки по количеству телефонов
            List<Map.Entry<String, String>> entries = new ArrayList<>(phonebook.entrySet());

            // Сортируем записи в порядке убывания количества телефонов
            entries.sort((entry1, entry2) -> {
                int phonesCount1 = entry1.getValue().split(", ").length;
                int phonesCount2 = entry2.getValue().split(", ").length;
                return Integer.compare(phonesCount2, phonesCount1);
            });

            // Выводы записи телефонной книги
            for (Map.Entry<String, String> entry : entries) {
                String[] nameAndSurname = entry.getKey().split(" ");
                String name = nameAndSurname[0];
                String surname = nameAndSurname[1];
                String phoneNumber = entry.getValue();
                System.out.println("name: " + name + " " + surname + ", phone: " + phoneNumber);
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

