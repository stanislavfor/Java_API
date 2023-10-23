package lesson_3.lecture;

import java.util.*;

// Итератор
// Получение итератора с целью более гибкой работы с данными.
// URL: https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
// Интерфейс Iterator<E>. Итератор коллекцией. Iterator занимает место
// Enumeration в Java Collections Framework.
// Итераторы отличаются от перечислений двумя способами:
// - Итераторы позволяют вызывающей стороне удалять элементы
// из базовой коллекции во время итерации с четко определенной семантикой.
// hasNext(), next(), remove()
// ListIterator<E>
// URL: https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html
// hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)

public class Ex007 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item); // Второй вариант вывода
        }

        Iterator<Integer> col = list.iterator();
        // System.out.println();

        while (col.hasNext()) {
            System.out.println(col.next()); // Второй вариант вывода
//            col.remove();
        }

    }
}
