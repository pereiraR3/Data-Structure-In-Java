package org.example.circularListStructure;

public class Node<T> {

    private T content;
    private Node<T> next;

    public Node(T inputContent){
        this.content = inputContent;
        this.next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }


}
