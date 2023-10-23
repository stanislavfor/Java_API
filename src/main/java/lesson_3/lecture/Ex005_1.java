package lesson_3.lecture;

import java.util.Arrays;
import java.util.List;

public class Ex005_1 {

        public static void main(String[] args) {
            StringBuilder day = new StringBuilder("28");
            StringBuilder month = new StringBuilder("9");
            StringBuilder year = new StringBuilder("1990");
            StringBuilder[] date = { day, month, year };
            List<StringBuilder> d = Arrays.asList(date);
            System.out.println(d); // [28, 9, 1990]
            date[0]= new StringBuilder("30");
            System.out.println(d); // [30, 9, 1990]
        }

}
