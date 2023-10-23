package lesson_5.seminar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Задание 2. Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают,
// что существует прямой путь, идущий от ”Город А” до“Город Б”.
// Верните город назначения, то есть город без какого-либо пути,
// ведущего в другой город.
// Пример:
// [["Москва","Самара"],["Курск","Пенза"],["Самара","Курск"]]
// Результат: Пенза
public class L_5x002 {
    public static void main(String[] args) {
        List<List<String>> paths = List.of(
                List.of("Moscow", "Samara"),
                List.of("Kursk", "Penza"),
                List.of("Samara", "Kursk")
        );

        String destination = destCity(paths);
        System.out.println("Destination City: " + destination);
    }

    public static String destCity(List<List<String>> paths) {
        Map<String, String> sources = new HashMap<>();

        // Create a mapping of cities to their destinations
        for (List<String> path : paths) {
            String source = path.get(0);
            String destination = path.get(1);
            sources.put(source, destination);
        }

        // Start from any city and follow the paths to find the destination city
        String currentCity = paths.get(0).get(0);

        while (sources.containsKey(currentCity)) {
            currentCity = sources.get(currentCity);
        }

        return currentCity;
    }

}
