package Lesson_5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        while (map.size() < 10) {
            String key = String.valueOf(Words.values()[new Random().nextInt(Words.values().length)]);
            map.put(key, (int) key.charAt(0));
            map1.put(key, (int) key.charAt(0));
        }
        System.out.println("map = " + map);
        System.out.println("map1 = " + map1);
    }
}