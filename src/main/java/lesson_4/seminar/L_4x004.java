package lesson_4.seminar;

import java.util.ArrayList;
import java.util.Scanner;

public class L_4x004 {


// Написать интерфейс текстового ввода ФИО возраст и пол.

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите ФИО, возраст, пол:");
        String personData = inputData();
        ArrayList<String> makeLine = new ArrayList<>();
        makeLine.add(personData);
        input.close();
    }

    public static String inputData() {
        String result = input.nextLine();
        return result;
    }

    public static void printData(ArrayList<String> arr) {
        for (String item : arr) {
            System.out.println(item);
        }
    }


}