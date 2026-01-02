package com.lesson;

import java.util.HashMap;

public class Map {
    private java.util.Map<String, Integer> map;

    public Map() {
        map = new HashMap<>();
    }

    public void addMt(String a, int w) {
        map.put(a, w);
    }

    public void removeMt(String s) {
        map.remove(s);
    }

    public void showMt() {
        System.out.println(map);
    }

}
