package lesson_1.homework;

class Calculator1 {
    public int calculate(char op, int a, int b) {

        int ans;
        switch(op) {
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

        Hw_3.Calculator calculator = new Hw_3.Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}