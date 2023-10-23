package lesson_1.homework;

public class Hw_3original {


    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        CalculatorOrg calculator = new CalculatorOrg();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }

    static class CalculatorOrg {
        public int calculate(char op, int a, int b) {
            return switch (op) {
                case '+' -> add(a, b);
                case '-' -> minus(a, b);
                case '*' -> mult(a, b);
                case '/' -> divide(a, b);
                default -> throw new IllegalArgumentException("Некорректный оператор: " + op);
            };
        }

        private int divide(int a, int b) {
            if (b != 0) return a / b;
            return -1;
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
    }
}

