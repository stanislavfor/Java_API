package lesson_6.homework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hw_3 {
//  SortedMap - карта с отсортированными ключами
    public static class Main {
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
            ArrayList<Integer> list = new ArrayList<>();
            map.put("Alex", 5);
            map.put("Bob", 7);
            map.put("Charles", 3);
            map.put("David", 1);
            map.put("Elena", 2);
            map.put("Phillip", 8);
            map.put("George", 4);
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                list.add(entry.getValue());
            }
            Collections.sort(list);
            for (int num : list) {
                for (Entry<String, Integer> entry : map.entrySet()) {
                    if (entry.getValue().equals(num)) {
                        sortedMap.put(entry.getKey(), num);
                        // System.out.println(sortedMap.put(entry.getKey(), num));
                        System.out.println(entry.getKey() + " " + entry.getValue());

                    }
                }

            }

            System.out.println("Вывод: " + sortedMap);
            System.out.println("Вывод: ");
            sortedMap.entrySet().forEach(System.out::println);

        }
    }

}
