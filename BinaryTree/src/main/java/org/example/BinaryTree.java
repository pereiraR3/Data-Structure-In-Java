package org.example;

public class BinaryTree <T extends Comparable<T>>{

    private BinNode<T> root;

    public BinaryTree(){
        this.root = null;
    }

    public void add(T content){
        BinNode<T> newNode = new BinNode<>(content);
        root = addNewNode(root, newNode);
    }

    private BinNode<T> addNewNode(BinNode<T> current, BinNode<T> newNode){
        if(current == null){
            return newNode;
        }else if(newNode.getContent().compareTo(current.getContent()) < 0){
            current.setNodeLeft(addNewNode(current.getNodeLeft(), newNode));
        }else{
            current.setNodeRight(addNewNode(current.getNodeRight(), newNode));
        }

        return current;
    }

    public void printInOrder(){
        System.out.println("\n Show InOrder");
        showInOrder(this.root);
    }

    private void showInOrder(BinNode<T> current){
        if(current != null){
            showInOrder(current.getNodeLeft());
            System.out.print(current.getContent() + ", ");
            showInOrder(current.getNodeRight());
        }

    }

    public void printPosOrder(){
        System.out.println("\n Show PosOrder");
        showPosOrder(this.root);
    }

    private void showPosOrder(BinNode<T> current){
        if(current != null){
            showPosOrder(current.getNodeLeft());
            showPosOrder(current.getNodeRight());
            System.out.print(current.getContent() + ", ");
        }

    }

    public void printPreOrder(){
        System.out.println("\n Show PreOrder");
        showPreOrder(this.root);
    }

    private void showPreOrder(BinNode<T> current){
        if(current != null){
            System.out.print(current.getContent() + ", ");
            showPreOrder(current.getNodeLeft());
            showPreOrder(current.getNodeRight());
        }

    }

    public void remove(T content) {
        try {
            BinNode<T> current = this.root;
            BinNode<T> father = null;

            while (current != null && !current.getContent().equals(content)) {
                father = current;
                if (content.compareTo(current.getContent()) < 0) {
                    current = current.getNodeLeft();
                } else {
                    current = current.getNodeRight();
                }
            }

            if (current == null) {
                System.out.println("Content Not Found. Block Try");
                return;
            }

            // Case 1: Removing the root node
            if (father == null) {
                this.root = removeNode(current);
            } else if (current == father.getNodeLeft()) {
                father.setNodeLeft(removeNode(current));
            } else {
                father.setNodeRight(removeNode(current));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private BinNode<T> removeNode(BinNode<T> node) {
        if (node == null) {
            return null;
        } else if (node.getNodeLeft() == null) {
            return node.getNodeRight();
        } else if (node.getNodeRight() == null) {
            return node.getNodeLeft();
        } else {
            BinNode<T> temp = node;
            BinNode<T> son = node.getNodeLeft();

            while (son.getNodeRight() != null) {
                temp = son;
                son = son.getNodeRight();
            }

            if (temp != node) {
                temp.setNodeRight(son.getNodeLeft());
                son.setNodeLeft(node.getNodeLeft());
            }

            son.setNodeRight(node.getNodeRight());
            return son;
        }
    }





}
