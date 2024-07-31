package org.example;

import org.example.model.Obj;

public class Main {
    public static void main(String[] args){

        BinaryTree<Obj> myTree = new BinaryTree<>();

        myTree.add(new Obj(13));
        myTree.add(new Obj(10));
        myTree.add(new Obj(25));
        myTree.add(new Obj(2));
        myTree.add(new Obj(12));
        myTree.add(new Obj(20));
        myTree.add(new Obj(31));
        myTree.add(new Obj(29));

        myTree.printInOrder();
        myTree.printPreOrder();
        myTree.printPosOrder();

        myTree.remove(new Obj(10));

        System.out.println("\n\n");

        myTree.printInOrder();
        myTree.printPreOrder();
        myTree.printPosOrder();

    }
}