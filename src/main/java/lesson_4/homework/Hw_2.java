package lesson_4.homework;

import java.util.LinkedList;

public class Hw_2 {
    
    static class MyQueue<T> {
        // Напишите свое решение ниже
        LinkedList<T> elements = new LinkedList<>();
        public void enqueue(T element){
            // Напишите свое решение ниже
            elements.add(element);
        }

        public T dequeue(){
            // Напишите свое решение ниже
            return (T) elements.removeFirst();

        }

        public T first(){
            // Напишите свое решение ниже
            return (T) elements.getFirst();

        }

        public LinkedList getElements() {
            // Напишите свое решение ниже
            return elements;

        }
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public static class Printer {
        public static void main(String[] args) {
            MyQueue<Integer> queue;
            queue = new MyQueue<>();

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                queue.enqueue(1);
                queue.enqueue(10);
                queue.enqueue(15);
                queue.enqueue(5);
            } else {
                queue.enqueue(Integer.parseInt(args[0]));
                queue.enqueue(Integer.parseInt(args[1]));
                queue.enqueue(Integer.parseInt(args[2]));
                queue.enqueue(Integer.parseInt(args[3]));
            }

            System.out.println("Hello, ...");
            System.out.println(queue.getElements());
            queue.dequeue();
            queue.dequeue();
            System.out.println(queue.getElements());
            System.out.println(queue.first());
        }
    }


}
