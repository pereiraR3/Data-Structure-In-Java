package org.example.data_structure_queue;

public class Node<T> {

    private T content;
    private Node<T> next;

    public Node(T inputContent){
        this.content = inputContent;
        this.next = null;
    }

    public T getContent() {
        return content;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

}
