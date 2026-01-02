package com.lesson;

import java.util.ArrayList;

public class List {
    private java.util.List<String> exam;

    public void List() {
        exam = new ArrayList<>();
    }

    public void addMt(String s) {
        exam.add(s);
    }

    public void removeMt(String s) {
        exam.remove(s);
    }

    public void showMt() {
        System.out.println(exam);
    }

}
