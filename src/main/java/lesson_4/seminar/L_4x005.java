package lesson_4.seminar;

// Создать мапу, где
// ключ - случайная строка из Char getName,
// а значение - индекс первой буквы ключа.

import java.util.Comparator;
import java.util.TreeMap;

public class L_4x005 {



    public static void main(String[] args) {
        String str = "С 12 октября в России начинает действовать новая статья УК РФ, предусматривающая суровое "
                + "наказание за сбор, уничтожение и повреждение краснокнижных грибов и растений.";
        String[] str1 = str.split(" ");
        TreeMap<String, Integer> tm = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }
                return o1.compareTo(o2);
            }
        });
        for (String item : str1) {
            tm.put(item, item.length());
        }
        tm.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}

