package lesson_2.seminar;

public class L_2x002 {
    public static void main(String[] args) {

        String s = "Hello";

        if(s.endsWith("o")) {
            System.out.println("Строка заканчивается на 'o'");
        }
        String[] s1 = s.split("e");
        System.out.println(s);
        s = s.replace("l", "p");
        System.out.println(s);

        String style = new String();
//        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder(style);
        builder1.append(true);
        builder1.append(444);
        style = builder1.toString();
        System.out.println(style);


    }


}
