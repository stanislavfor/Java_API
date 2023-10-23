package lesson_5.seminar;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class L_5x005 {
    public static void main(String[] args) {
        // LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> map1 = new HashMap<>(map);
        map.putAll(map1);
        System.out.println(map.put(1, "One"));
        // System.out.println(map.put(1, "Two"));
        // System.out.println(map.put(1, "Three"));
        // System.out.println(map.get(1));
        // System.out.println(map.putIfAbsent(2, "Odin"));
        // // String str = map.remove(2);
        // map.getOrDefault(2, "Def");
        // System.out.println(map.replace(2, "Dwa"));
        // System.out.println(map.get(2));
        // map.replace(2, "Dwa", "Dwa_v2");
        // if (map.containsKey(1)) {}
        // if (map.containsValue("Dwa")) {} for (int i = 0; i < 10; i++) {
        // map.put(i, Character.getName(i)); }
        // System.out.println(map);
        // for (int k: map.keySet()) {
        // System.out.println(k+"="+map.get(k));
        // } // // Iterator<Integer> iterator = map.keySet().iterator();
        // while (iterator.hasNext()){ // int i = iterator.next();
        // map.replace(i, "t"); // } // for (int k: map.keySet()){
        // map.compute(k, (key, v) -> v==null ? "Def": v.replace("OF", "Def"));
        // map.computeIfAbsent(k, (v) -> "Def");
        // map.computeIfPresent(k, (key, v) -> v==null ? "Def": v.replace("OF", "Def"));
        // }
        // map.replaceAll( (k, v) -> { if (v.contains("OF")) { v = "Def";
        // }else v=String.valueOf(k);
        // return v; } );
        // map.merge(1, "One", (o, n) -> { // o+n return ":"; });
        // map.forEach( (k, v) -> System.out.println(k+"="+v)); }
    }

}