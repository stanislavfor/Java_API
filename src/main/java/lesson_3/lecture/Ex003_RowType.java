package lesson_3.lecture;

import java.util.ArrayList;
import java.util.List;

// Коллекции. Row Type
public class Ex003_RowType {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(2809);
        list.add("string line");
        for (Object o : list) {
            System.out.println(o);
            // Проблема извлечения данных
        }
    }

} // row type java
