package org.example;

import org.example.data_structure_queue.Queue;

/**
 *  Dynamic Structure
 */

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new Queue<>();

        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");

        System.out.println(queue.toString());

        queue.dequeue();

        System.out.println(queue.toString());

    }
}