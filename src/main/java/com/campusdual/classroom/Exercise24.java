package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Smith");
        queue.offer("Montessori");
        queue.offer("Peralta");
        queue.offer("House");
        return queue;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        while (!queue.isEmpty()) {
            String element = queue.poll(); // poll() devuelve y elimina el elemento de la cabeza de la cola
            //tambien se puede hacer con peek() y remove() pero con poll() te ahorras una linea
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Queue<String> myQueue = createQueue();

        printAndEmptyQueue(myQueue);
    }

}
