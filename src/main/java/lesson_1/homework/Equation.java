package lesson_1.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Выполнять, чтобы работало

class Equation {
    public static String getSolution(String str, String file) throws IOException {
        // Введите свое решение ниже
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String equation = reader.readLine();
        reader.close();
        System.out.println("Given the equation: " + equation);
        int q = 0, w = 0, e = 0;
        String result = "";
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                String modifiedEquation = equation.replace("?", String.valueOf(i)).replace("?", String.valueOf(j));
                String[] parts = modifiedEquation.split(" ");
                if (parts.length == 2) {
                    q = Integer.parseInt(parts[0].trim());
                    w = Integer.parseInt(parts[1].trim());
                    if (equation.contains("+")) {
                        result = q + " + " + w;
                        e = q + w;
                    } else {
                        result = q + " - " + w;
                        e = q - w;
                    }
                    if (e == Integer.parseInt(parts[2].trim())) {
                        return "Result: " + result;
                    }
                }
            }
        }
        return "No solution";
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

        public static void main(String[] args) {
            String file = "";

            if (args.length == 0) {
                file = "input.txt";
            } else {
                file = args[0];
            }

//            Equation eq = new Equation();
//            String result = eq.getSolution(file);
//            System.out.println(result);

        }
}






