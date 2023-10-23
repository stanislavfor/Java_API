package lesson_4.seminar;

import java.util.ArrayDeque;
import java.util.Deque;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

// Задание 2.Даны два Deque представляющие два неотрицательных целых числа.
// Цифры хранятся в обратном порядке, и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.


public class L_4x002 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static class AddTwoDequesAsNumbers {
        public ListNode addTwoNumbers(Deque<Integer> deque1, Deque<Integer> deque2) {
            int carry = 0;
            ListNode dummyHead = new ListNode(0);
            ListNode current = dummyHead;

            while (!deque1.isEmpty() || !deque2.isEmpty() || carry > 0) {
                int x = deque1.isEmpty() ? 0 : deque1.remove();
                int y = deque2.isEmpty() ? 0 : deque2.remove();
                int sum = x + y + carry;

                carry = sum / 10;
                current.next = new ListNode(sum % 10);
                current = current.next;
            }

            return dummyHead.next;
        }

        public void main(String[] args) {
            // Example usage:
            Deque<Integer> deque1 = new ArrayDeque<>();
            deque1.add(2);
            deque1.add(4);
            deque1.add(3);

            Deque<Integer> deque2 = new ArrayDeque<>();
            deque2.add(5);
            deque2.add(6);
            deque2.add(4);

            AddTwoDequesAsNumbers solution = new AddTwoDequesAsNumbers();
            ListNode result = solution.addTwoNumbers(deque1, deque2);

            // Print the result linked list
            while (result != null) {
                System.out.print(result.val + " -> ");
                result = result.next;
            }
            System.out.println("null");
        }
    }
}
