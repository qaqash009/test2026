package com.lesson;

public class LinkedList {

    private java.util.LinkedList<String> list;

    public LinkedList() {
        list = new LinkedList<Integer>();
    }

    public void addMt(String s) {
        list.add(s);
    }

    public void removeMt(String s) {
        list.remove(s);
    }

    public void showMt() {
        System.out.println(list);
    }
}
