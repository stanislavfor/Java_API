package lesson_4.seminar;

// Создать мапу, где
// ключ - случайная строка из Char getName,
// а значение - индекс первой буквы ключа.

// Random random = new Random();

import java.util.*;

public class L_4x006 {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        Random rnd = new Random();
        while (hm.size() < 10) {
            int num = rnd.nextInt(25);
            String str = Character.getName(num);
            hm.put(str, (int) str.charAt(0));
        }
        hm.forEach((k, v) -> System.out.println(k + "=" + v));
        ArrayList<Integer> al = new ArrayList<>(hm.values());
        al.sort(Comparator.naturalOrder());
        for (int v:al) {
        for (String k:hm.keySet()) {
        if (hm.get(k) == v) {
        System.out.println(k + "=" + v);
        }
        }
        } hm.entrySet()  // новое значение
        .stream()  // преобразование в стрим
         .sorted(Map.Entry.comparingByValue()) // сортировка понтовая
         .limit(5) // лимит количества до 5
        .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));  // распечатка
        }

}


