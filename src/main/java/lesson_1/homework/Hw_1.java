package lesson_1.homework;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n).
//Внутри класса Answer напишите метод countNTriangle,
// который принимает число n и возвращает его n-ое треугольное число.
//Пример
//n = 4 -> 10
//n = 5 -> 15

public class Hw_1 {

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 4;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}

class Answer {
    public int countNTriangle(int n){
        // Введите свое решение ниже

        int res = 0;
        for(int i = 1; i <= n; i++){
            res += i;
        }
        return res;
    }
}






