package com.lesson;


public class Stack<I extends Number> {

    private java.util.Stack<Integer> stack;

    public Stack() {
    }

    public void pushMt(int s) {
        stack.push(s);
    }

    public void popMt() {
        if (!stack.isEmpty()) {
            stack.pop();
        } else {
            System.out.println("sagol");
        }
    }

    public void showMt() {
        System.out.println(stack);
    }
}
