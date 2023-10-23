package lesson_6.seminar;

// Разработать класс, исполняющий функционал класса HashSet
// без использования сетов вообще.
// Храним целые числа.
// Реализовать метод добавления элемента учитывающий особенности множеств.
// Сигнатура метода public boolean add(Integer i).
// Реализовать метод удаления элемента учитывающий особенности множеств.
// Сигнатура метода boolean remove(Object o).

import java.util.HashMap;
import java.util.Iterator;

public class L_6x001 {
    public static void main(String[] args) {
        MySet<String> mySet = new MySet<>();
        System.out.println(mySet);
        System.out.println("-".repeat(16) + "add" + "-".repeat(16));
        System.out.println(mySet.add("1"));
        System.out.println(mySet.add("2"));
        System.out.println(mySet.add("3"));
        System.out.println(mySet.add("1"));
        System.out.println(mySet.add("2"));
        System.out.println(mySet.add("3"));
        System.out.println("-".repeat(16) + "remove" + "-".repeat(16));
        System.out.println(mySet.remove("1"));
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }

    static class MySet<E> {
        private final HashMap<E, Object> map = new HashMap<>();
        private static final Object PRESENT = new Object();

        public boolean add(E e) {
            return map.put(e, PRESENT) == null;
        }

        public boolean remove(Object o) {
            return map.remove(o) == PRESENT;
        }

        public void clear() {
            map.clear();
        }

        public Iterator<E> iterator() {
            return map.keySet().iterator();
        }

        public int size() {
            return map.size();
        }
    }


}