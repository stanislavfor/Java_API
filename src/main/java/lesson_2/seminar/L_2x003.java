package lesson_2.seminar;

public class L_2x003 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hellohello worldhello";
        for(int i = 0; i < s2.length(); i++) {
            if (s2.indexOf(s1, i) != -1){
                System.out.println(s2.indexOf(s1, i));
                i = s2.indexOf(s1, i) + 1;
            }
        }

    }

}
