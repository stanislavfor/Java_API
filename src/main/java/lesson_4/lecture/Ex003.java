package lesson_4.lecture;

import java.util.*;

public class Ex003 {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.add(2);
        deque.addLast(3);
        System.out.println("deque = " + deque);
        deque.removeFirst();
        System.out.println("deque.removeFirst() -> " + deque);
        deque.removeLast();
        System.out.println("deque.removeLast() -> " + deque);

        deque.add(3);
        deque.add(4);
        deque.add(5);
        System.out.println("deque = " + deque);
        //deque.getFirst();
        System.out.println("deque.getFirst() = " + deque.getFirst());
        //deque.getLast();
        System.out.println("deque.getLast() = " + deque.getLast());

        deque.offerFirst(1);
        deque.offerLast(6);
        System.out.println(deque);
        //deque.pollFirst();
        System.out.println("deque.pollFirst() -> " + deque.pollFirst());
        //deque.pollLast();
        System.out.println("deque.pollLast() -> " + deque.pollLast());
        //deque.poll();
        System.out.println("deque = " + deque);
        deque.push(1);
        System.out.println("deque.push(1) -> " + deque);
        deque.push(0);
        System.out.println("deque.push(0) -> " + deque);
        System.out.println("deque = " + deque);
        //deque.peekFirst();
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        //deque.peekLast();
        System.out.println("deque.peekLast() = " + deque.peekLast());
        System.out.println("deque = " + deque);
        //deque.poll();
//        deque.poll();
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque = " + deque);

    }
}