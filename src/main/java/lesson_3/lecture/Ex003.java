package lesson_3.lecture;

import java.util.ArrayList;

// ArrayList

public class Ex003 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(111);
        System.out.println(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(222);
        System.out.println(list2);
        ArrayList<Integer> list3 = new ArrayList<>(10);
        list3.add(333);
        GetType(list3);
        System.out.println(list3);
        ArrayList<Integer> list4 = new ArrayList<>(list3);
        //System.out.println(list4);
        System.out.println(list4);

    }

    static void GetType(Object list3) {
        System.out.println(list3.getClass().getName());
    }

}
