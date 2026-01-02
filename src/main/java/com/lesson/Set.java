package com.lesson;

import java.util.HashSet;

public class Set {

    private java.util.Set<Integer> set;

    public Set() {
        set = new HashSet<>();
    }

    public void addMt(int s) {
        set.add(s);
    }

    public void removeMt(int s) {
        set.remove(s);
    }

    public void showMt() {
        System.out.println(set);
    }


}
