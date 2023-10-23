package lesson_3.lecture;

import java.util.*;
public class Ex006_1 {

    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = new ArrayList<Character>();
        list1.add('S');
        list1.add('e');
        list1.add('r');
        list1.add('g');
        System.out.println(list1);
        list1.remove(1); // java.lang.UnsupportedOperationException
        System.out.println(list1);

    }
}
