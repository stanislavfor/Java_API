package lesson_2.homework;

// Распарсить JSON:
// Внутри класса Answer напишите метод answer, который распарсит json и,
// используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].
// На вход метода answer подаются аргументы:
// String JSON
// String ELEMENT1
// String ELEMENT2
// String ELEMENT3
// Пример:
// JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
//    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
//    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
// ELEMENT1 = "Студент ";
// ELEMENT2 = " получил ";
// ELEMENT3 = " по предмету ";
//// Студент Иванов получил 5 по предмету Математика
//// Студент Петрова получил 4 по предмету Информатика
//// Студент Краснов получил 5 по предмету Физика

public class Hw_3original {
    static class Answer {
        public static void answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
            StringBuilder sb = new StringBuilder();
            String newJSON = JSON.replaceAll("\\{", "").replaceAll("\\}", "")
                    .replaceAll("\"", "").replace('[', ' ').replace(']', ' ');
            String[] parts = newJSON.split(",");
            for (String part : parts){
                String[] params = part.split(":");
                switch (params[0].trim()) {
                    case "фамилия" -> sb = new StringBuilder(ELEMENT1).append(params[1]);
                    case "оценка" -> sb.append(ELEMENT2).append(params[1]);
                    case "предмет" -> {
                        sb.append(ELEMENT3).append(params[1]);
                        System.out.println(sb);
                    }
                }
            }
        }
    }


    public static class Printer{
        public static void main(String[] args) {
            String JSON = "";
            String ELEMENT1 = "";
            String ELEMENT2 = "";
            String ELEMENT3 = "";

            if (args.length == 0) {
                JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                        "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                        "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
                ELEMENT1 = "Студент ";
                ELEMENT2 = " получил ";
                ELEMENT3 = " по предмету ";
            }
            else{
                JSON = args[0];
                ELEMENT1 = args[1];
                ELEMENT2 = args[2];
                ELEMENT3 = args[3];
            }

            //Answer ans = new Answer();
            Answer.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
        }
    }


}
