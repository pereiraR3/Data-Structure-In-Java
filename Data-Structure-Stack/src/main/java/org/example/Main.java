package org.example;

import org.example.data_structure_stack.Node;
import org.example.data_structure_stack.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> newStack = new Stack<String>();
        newStack.push(new Node<String>("Conteudo 01"));
        newStack.push(new Node<String>("Conteudo 02"));
        newStack.push(new Node<String>("Conteudo 03"));
        newStack.push(new Node<String>("Conteudo 04"));
        newStack.push(new Node<String>("Conteudo 05"));

        System.out.println(newStack.toString());

    }
}