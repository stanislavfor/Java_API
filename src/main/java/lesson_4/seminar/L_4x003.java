package lesson_4.seminar;

import java.util.Stack;

// Задание 3. Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']',
// определите, является ли входная строка логически правильной.
// Входная строка логически правильная, если:
//  1) Открытые скобки должны быть закрыты скобками того же типа.
//  2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая
//  скобка имеет соответствующую открытую скобку того же типа.
// Пример:
// 1) ()[] = true
// 2) () = true
// 3) {[()]} = true
// 4) ()() = true
// 5) )()( = false

public class L_4x003 {
    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char openBracket = stack.pop();
                if ((c == ')' && openBracket != '(') ||
                        (c == '}' && openBracket != '{') ||
                        (c == ']' && openBracket != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input1 = "()[]";
        String input2 = "()";
        String input3 = "{[()]}";
        String input4 = "()()";
        String input5 = ")()(";

//        for (int i=1; i < 6; i++){
//            String inputIndex;
//            if (isValid(input1)) {
//                inputIndex = " да";
//            } else {
//                inputIndex = " нет";
//            }
//        }
        
        System.out.println("Эта строка'" + input1 + "' = " + isValid(input1));
        System.out.println("Эта строка'" + input2 + "' = " + isValid(input2));
        System.out.println("Эта строка'" + input3 + "' = " + isValid(input3));
        System.out.println("Эта строка'" + input4 + "' = " + isValid(input4));
        System.out.println("Эта строка'" + input5 + "' = " + isValid(input5));
    }

}
