package lesson_1.homework;

import java.util.Scanner;

public class Lesson_1_HW {

//    Задача 1: Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// Вариант первый
    public static class Task1 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите число: ");
            int n = scan.nextInt();
            System.out.println((n * (n + 1)) / 2);

        }
    }

// Вариант второй
//    public static class Task1_2 {
//        static class Answer {
//            public int countNTriangle(int n) {
//                int sum = 0;
//                for (int i = 1; i <= n; i++) {
//                    sum += i;
//                }
//                return sum;
//            }
//        }
//
//        public static class Printer {
//            public void main() {
//                int n = 0;
//
//                if (args.length == 0) {
//                    n = 4;
//                } else {
//                    n = Integer.parseInt(args[0]);
//                }
//
//                Answer ans = new Answer();
//                int itresume_res = ans.countNTriangle(n);
//                System.out.println(itresume_res);
//            }
//        }
//
//    }

//    Задача 2: Вывести все простые числа от 1 до 1000
    public static class task2 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            for (int i = 1; i < 1001; i++) {
                if (i % 100 == 0) {
                    System.out.println(" ");
                }
                System.out.print(i + " ");
            }
        }

    }

//    Задача 3:Реализовать простой калькулятор

    public static class Task3 {
        public static void main(String[] args) {

            double num1;
            double num2;
            double ans;
            char op;
            Scanner reader = new Scanner(System.in);
            System.out.print("Введите два числа: ");
            num1 = reader.nextDouble();
            num2 = reader.nextDouble();
            System.out.print("\nВведите оператор (+, -, *, /): ");
            op = reader.next().charAt(0);
            switch(op) {
                case '+': ans = num1 + num2;
                    break;
                case '-': ans = num1 - num2;
                    break;
                case '*': ans = num1 * num2;
                    break;
                case '/': ans = num1 / num2;
                    break;
                default:  System.out.println("Введите корректные данные.");
                    return;
            }
            System.out.print("\nРезультат:\n");
            System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
        }
    }


//    Задача 4: (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
//    Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//    Требуется восстановить выражение до верного равенства.
//    Предложить хотя бы одно решение или сообщить, что его нет.

    public static class Task4 {
        public static void main(String[] args) {

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    for (int k = 0; k < 9; k++) {
                        for (int l = 0; l < 9; l++) {
                            for (int m = 0; m < 9; m++) {
                                for (int n = 0; n < 9; n++) {
                                    if ((i * 10 + j) + (k * 10 + l) == (m * 10 + n)) {
                                        int q = i * 10 + j;
                                        int w = k * 10 + l;
                                        int e = m * 10 + n;
//                                        System.out.printf("%d + %d = %d   ", q, w, e);
                                        System.out.print(q +" + " + w + " = " + e + "; ");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


}
