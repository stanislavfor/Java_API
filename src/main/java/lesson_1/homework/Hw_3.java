package lesson_1.homework;

// Реализуйте простой калькулятор:
// Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /)
// над двумя числами и возвращать результат. В классе должен быть метод calculate,
// который принимает оператор и значения аргументов и возвращает результат вычислений.
// При неверно переданном операторе,
// программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
// Аргументы, передаваемые в метод/функцию:
// '3'
// '+'
// '7'
// На выходе:
// 10

public class Hw_3 {

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }


    static class Calculator {
        public int calculate(char op, int a, int b) {
            // Введите свое решение ниже//
            int ans;
            switch (op) {
                case '+':
                    ans = a + b;
                    break;
                case '-':
                    ans = a - b;
                    break;
                case '*':
                    ans = a * b;
                    break;
                case '/':
                    ans = a / b;
                    break;
                default:
                    System.out.print("Некорректный оператор: 'op'");
                    return op;
            }
            return ans;
        }
    }
}
