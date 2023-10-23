package lesson_4.seminar;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;


public class L_4x001s {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> makeLine = new ArrayList<>();
        while (true) {
            System.out.println("Введите данные пользователя:");
            String personData = inputData();
            if (personData.equals("exit")) break;
            makeLine.add(personData);
        }
        System.out.println("Данные пользователей: ");
        printData(makeLine);

        makeLine.sort((o1, o2) -> {
            String[] s1 = o1.split(" ");
            String[] s2 = o2.split(" ");
            int i1 = Integer.parseInt(s1[3]);
            int i2 = Integer.parseInt(s2[3]);
            return i1 - i2;
        });
        System.out.println("-".repeat(16));
        printData(makeLine);

        makeLine.sort((o1, o2) -> {
            String[] s1 = o1.split(" ");
            String[] s2 = o2.split(" ");
            return s1[4].compareTo(s2[4]);
        });
        System.out.println("-".repeat(16));
        printData(makeLine);
        input.close();
    }

    public static String inputData() {
        return input.nextLine();
    }

    public static void printData(ArrayList<String> arr) {
        for (String item : arr) {
            System.out.println(item);
        }
    }


}
