package com.lesson;

public class Queue {
    private java.util.Queue<String> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public void enqueue(String s) {
        queue.add(s);
    }

    public void dequeue() {
        if (!queue.isEmpty()) {
            queue.poll();
        } else {
            System.out.println("salamat qadan alim");
        }
    }

    public void showMt() {
        System.out.println(queue);
    }

}
