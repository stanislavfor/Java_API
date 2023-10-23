package lesson_1.seminar;

import java.util.Scanner;
import static java.lang.Character.getType;

// Настройка рабочего места
/**
 * Program
 */

public class Lesson1_ {

    public static void main(String[] args) {

        System.out.println("Goodbye world");

//      Основы: типы данных

        short age = 10;
        int salary = 123456;
        System.out.println(age); //10
        System.out.println(salary); //123456
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415
        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false
        String msg = "Hello world";
        System.out.println(msg); // Hello world

//      Неявная типизация

        System.out.println("Неявная типизация ->");
        var a = 123;
        System.out.println(a); // 123
        double d = 123.456;
        System.out.println(d); // 123.456
        System.out.println(getType(a)); // Integer
        System.out.println(getType((char) d)); // Double
        d = 1022;
        System.out.println(d); // 1022
        //d = "mistake";
        //error: incompatible types:
        //String cannot be converted to double

//    Основы: типы данных

        System.out.println("Основы: типы данных ->");
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648

//    Массивы Одномерные

        System.out.println("Массивы Одномерные ->");
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr.length); // 5

//       Массивы Многомерные

        System.out.println("Массивы Многомерные ->");
        int[] arrs[] = new int[3][5];
        for (int[] line : arrs) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

//       Преобразования

        System.out.println("Преобразования ->");
        int i = 123;
        double dd = i;
        System.out.println(i); // 123
        System.out.println(dd); // 123.0
        dd = 3.1415;
        i = (int) dd;
        System.out.println(dd); // 3.1415
        System.out.println(i); // 3
        dd = 3.9415;
        //i = (int) dd;
        System.out.println(dd); // 3.9415
        System.out.println(i); // 3
        byte b = Byte.parseByte("123");
        System.out.println(b); // 123
//        byte be = Byte.parseByte("1234");
//        System.out.println(be); // NumberFormatException: Value out of range

//        Но,
//        int[] aa = new int[10];
//        double[] ddd = aa; // ИЗУЧАЕМ ковариантность и контравариантность
//        Получение данных из терминала c exfcnbtv import java.util.Scanner;


        System.out.println("Ковариантность и контравариантность ->");
        Scanner iScanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s! ", name);
//        iScanner.close();
        Scanner iScanners = new Scanner(System.in);
        System.out.print("int a: ");
        int x = iScanners.nextInt();
//        while(iScanner.hasNext())
//            System.out.println(iScanner.next());
        System.out.print("double a: ");
        double y = iScanners.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        System.out.print("\n");
        iScanners.close();

//        Форматированный вывод
        int aa = 1, ba = 2;
        int c = aa + ba;
        String res = aa + " + " + ba + " = " + c;
        System.out.println("Форматированный вывод ->");
        System.out.println(res);

    }


}


