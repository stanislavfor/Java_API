package lesson_5.seminar;

import java.util.*;
// Задание 3. Дана строка. Необходимо написать метод, который
// отсортирует слова в строке по длине с помощью TreeMap.
// Строки с одинаковой длиной не должны “потеряться”.
// Пример строки:
//  Я помню чудное мгновенье
//  Передо мной явилась ты
//  Как мимолетное виденье
//  Как гений чистой красоты


public class L_5x003 {
    public static Map<Integer, List<String>> sortWordsByLength(String text) {
        String[] words = text.split("\\s+");
        Map<Integer, List<String>> wordMap = new TreeMap<>();

        for (String word : words) {
            int wordLength = word.length();
            wordMap.computeIfAbsent(wordLength, k -> new ArrayList<>()).add(word);
        }

        return wordMap;
    }

    public static void main(String[] args) {
        String text = "Я помню чудное мгновенье Передо мной явилась ты Как мимолетное виденье Как гений чистой красоты";
        Map<Integer, List<String>> sortedWords = sortWordsByLength(text);

        for (Map.Entry<Integer, List<String>> entry : sortedWords.entrySet()) {
            String index_Letter;
            if (entry.getKey() == 1) {
                index_Letter = "";
            } else if (entry.getKey() > 1 && entry.getKey() < 5) {
                index_Letter = "a";
            } else {
                index_Letter = "ов";
            }

            System.out.println("Слово с длиной строки " +
                        entry.getKey() + " знак" + index_Letter + ": " + entry.getValue());

        }
    }

}
