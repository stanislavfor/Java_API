package lesson_1.homework;

// Напишите функцию printPrimeNums,
// которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
// Напишите свой код в методе printPrimeNums класса Answer.
// Пример:
// 2
// 3
// 5
// 7
// 11
// ...

public class Hw_2 {
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static void main(String[] args) {

            Answer2 ans = new Answer2();
            ans.printPrimeNums();
    }
}


class Answer2 {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        boolean isPrime;
        for(int i = 1; i < 1000; i++) {
            isPrime = i == 1;
            for(int j = 2; j < 1000; j++) {
                if (i >= j && i % j == 0) {
                    if(j == i) {
                        isPrime = true;
                    } break;
                }
            }
            if(isPrime) System.out.println(i);
        }
    }
}
