package org.example;

import org.example.circularListStructure.CircularList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CircularList<Integer> list = new CircularList<>();

        list.add(1, 0);
        list.add(2, 0);
        list.add(3, 2);

        System.out.println(list.toString());

        list.removeByPosition(2);

        System.out.println(list.toString());

        System.out.println(list.getSize());

    }
}