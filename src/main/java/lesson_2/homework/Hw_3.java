package lesson_2.homework;

// Задача 3.** Дана json строка (можно сохранить в файл и читать из файла)
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод(ы), который распарсит json и, используя StringBuilder,
// создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;


public class Hw_3 {

    public static String [] ReadLineFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((br.readLine()) != null) {
            size +=1;
        }
        br.close();
        String [] listData = new String [size];

        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
        }
        br1.close();
        return listData;

    }

    public static void main(String[] args) throws Exception {//
        String[] arrayData = ReadLineFromFile("data_1.txt");
        StringBuilder resultSelect = PrintLine(arrayData[0]);
//        System.out.println(resultSelect);
    }

    public static StringBuilder PrintLine(String line) {
        String line1 = line.replace("{", "");
        String line2 = line1.replace("}", "");
        String line3 = line2.replaceAll("\"", "");
        String line4 = line3.replace("[", "");
        String line5 = line4.replace("]", "");
        String line6 = line5.replace("фамилия:", "");
        String line7 = line6.replace("оценка:", "");
        String line8 = line7.replace("предмет:", "");
        StringBuilder result = new StringBuilder();
        String [] arrayData = line8.split(",");
//        System.out.println(Arrays.toString(arrayData));
//        System.out.println(arrayData.length);
        for (int i = 0; i < arrayData.length ; i = i+3) {
        System.out.println("Студент " + arrayData[i] + " получил " + arrayData[i+1] + " по предмету " + arrayData[i+2] + ".");
//
       }
//
       return result;
   }

}
