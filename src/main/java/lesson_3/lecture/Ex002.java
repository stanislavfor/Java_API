package lesson_3.lecture;

import java.util.ArrayList;

// Иерархия коллекций. ArrayList
// «Удобный массив» - коллекция, Разные способы создания
// ArrayList list = new ArrayList();
// Interface List -> https://docs.oracle.com/javase/8/docs/api/java/util/List.html

public class Ex002 {

   public static void main(String[] args) {
       // Разные способы создания:
       //ArrayList<Integer> list1 = new ArrayList<Integer>();
       //ArrayList<Integer> list2 = new ArrayList<>();
       //ArrayList<Integer> list3 = new ArrayList<>(10);
       //ArrayList<Integer> list4 = new ArrayList<>(list3);

       ArrayList<Integer> list = new ArrayList<Integer>();
       //ArrayList list = new ArrayList();
       list.add(2809);
       list.add(2800);

       for (Object o : list) {
           System.out.println(o);
       }
   }
}
