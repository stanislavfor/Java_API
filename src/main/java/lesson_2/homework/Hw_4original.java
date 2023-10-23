package lesson_2.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Hw_4original{

    public static class Printer {
        private static final String LOG_FILE_PATH = "log_calc_original.txt";
        public static void main(String[] args) {
            int a;
            char op;
            int b;
            Scanner reader = new Scanner(System.in);

            if (args.length == 0) {
//                a = 3;
//                op = '+';
//                b = 7;
                System.out.print("Введите первое числа: ");
                a = reader.nextInt();
                System.out.print("Введите оператор (+, -, *, /): ");
                op = reader.next().charAt(0);
                System.out.print("Введите второе числа: ");
                b = reader.nextInt();
            } else {
                a = Integer.parseInt(args[0]);
                op = args[1].charAt(0);
                b = Integer.parseInt(args[2]);
            }

            clearLogFile();
            Calculator calculator = new Calculator();
            int result = calculator.calculate(op, a, b);
            System.out.print("Результат вычисления: ");
            System.out.println(result);

            try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void clearLogFile() {
            File logFile = new File(LOG_FILE_PATH);
            if (logFile.exists()) {
                try {
                    FileWriter fileWriter = new FileWriter(logFile, false);
                    fileWriter.write("");
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Calculator {
        public int calculate(char op, int a, int b) {
            try (FileWriter fileWriter = new FileWriter("log_calc_original.txt", true)) {
                logStep(fileWriter, "User entered the first operand = " + a);
                logStep(fileWriter, "User entered the operation = " + op);
                logStep(fileWriter, "User entered the second operand = " + b);

                switch (op) {
                    case '+':
                        int sum = add(a, b);
                        logStep(fileWriter, "Result is " + sum);
                        return sum;
                    case '-':
                        int diff = minus(a, b);
                        logStep(fileWriter, "Result is " + diff);
                        return diff;
                    case '*':
                        int prod = mult(a, b);
                        logStep(fileWriter, "Result is " + prod);
                        return prod;
                    case '/':
                        int quotient = divide(a, b);
                        logStep(fileWriter, "Result is " + quotient);
                        return quotient;
                    default:
                        throw new IllegalArgumentException("Некорректный оператор: " + op);
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }

        private int divide(int a, int b) {
            if (b != 0) return a / b;
            throw new ArithmeticException("Деление на 0 недопустимо");
        }

        private int mult(int a, int b) {
            return a * b;
        }

        private int minus(int a, int b) {
            return a - b;
        }

        private int add(int a, int b) {
            return a + b;
        }

        private void logStep(FileWriter fileWriter, String note) throws IOException {
            LocalDateTime currentTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String formattedTime = currentTime.format(formatter);
            fileWriter.write(formattedTime + " " + note + "\n");
        }

    }


}