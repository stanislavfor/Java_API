package lesson_2.homework;

import lesson_2.lecture.Ex005_Logger;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.logging.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Задача 4*. К калькулятору из предыдущего ДЗ добавить логирование
// (история операций на калькуляторе).


public class Hw_4 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Logger.class.getName());
        logger.setLevel(Level.INFO);
//        FileHandler fh = new FileHandler("log.xml");
        FileHandler fh = new FileHandler("log_calc.txt");
        logger.addHandler(fh);
        // XMLFormatter xml = new XMLFormatter();
        SimpleFormatter sFormat = new SimpleFormatter();
        // fh.setFormatter(xml);
        fh.setFormatter(sFormat);
        logger.log(Level.WARNING, "Тестовое логирование");

        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
//                logger.info("log "+ (num1 + num2));
                break;
            case '-': ans = num1 - num2;
//                logger.info("log "+ (num1 - num2));
                break;
            case '*': ans = num1 * num2;
//                logger.info("log "+ (num1 * num2));
                break;
            case '/': ans = num1 / num2;
//                logger.info("log "+ (num1 / num2));
                break;
            default:  System.out.println("Введите корректные данные.");
                return;
        }
        System.out.print("Результат: ");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans + "\n");
        logger.info("log: " + "первое число = " + num1 + " второе число = " + num2 + " операнда (" + op  + ") результат -> " + ans);
//        logger.info("log: " + num1);
//        logger.info("log: " + num2);
//        logger.info("log; " + op);
//        System.out.print("\n");
//        String DateTimePattern = "HH:mm";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateTimePattern);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
        LocalTime time = LocalTime.now();
        System.out.println(time.format(formatter));
    }
}


