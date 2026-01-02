package com.lesson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Idris", "Ehmedzade", 18);
        Student student2 = new Student("Aysu", "Agamaliyeva", 19);
        Student student3 = new Student("Nihad", "Asgarli", 22);

        //student klasi yarat name surname yaw saxla icinde, main methodunun icerisinde list student yarat 3 eded student obyekti otur icerisine sonuncu student obyektin adini Nihad ele

        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student : students) {
            System.out.println(student);
        }
        // todo set linkedList stack map, queue, list tekrarla

        // Set
        Set mySet = new Set();
        mySet.addMt(10);
        mySet.addMt(20);
        mySet.showMt();

        // LinkedList
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addMt("alma");
        myLinkedList.addMt("armud");
        myLinkedList.showMt();

        // Stack
        Stack<Number> myStack = new Stack<Number>();
        myStack.pushMt(5);
        myStack.pushMt(10);
        myStack.showMt();
        myStack.popMt();
        myStack.showMt();

        // Map
        Map myMap = new Map();
        myMap.addMt("A", 1);
        myMap.addMt("B", 2);
        myMap.showMt();

        // Queue
        Queue myQueue = new Queue();
        myQueue.enqueue("salam");
        myQueue.enqueue("sagol");
        myQueue.showMt();
        myQueue.dequeue();
        myQueue.showMt();

    }
}