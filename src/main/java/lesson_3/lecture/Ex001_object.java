package lesson_3.lecture;

// Массивы
// Проблема. Как увеличить размер массива?
// Есть массив из 2 элементов, например:

public class Ex001_object {

    public static void main(String[] args) {
        int[] a = new int[] { 1, 9 };
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);
        for (int i : a) { System.out.printf("%d ", i);} // 1 9
        for (int j : b) { System.out.printf("%d ", j);}
        // 0 9 0 0 0 0 0 0 0 0
        System.out.println(" ");

        int[] bi = new int[] { 0, 9 };
        for (int i : bi) { System.out.printf("%d ", i); }
        bi = AddItem(bi, 2);
        bi = AddItem(bi, 3);
        for (int j : bi) { System.out.printf("%d ", j); }
    }

    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }


}
