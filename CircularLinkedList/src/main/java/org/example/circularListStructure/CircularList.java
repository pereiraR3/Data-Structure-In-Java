package org.example.circularListStructure;

/**
 * Dynamic Structure
 */

public class CircularList<T> {

    private Integer size; // Length
    private Node<T> tail; // Last value
    private Node<T> head; // First value

    public CircularList(){
        this.size = 0;
        this.tail = null;
        this.head = null;
    }

    public boolean fullIs(){
        return this.size != 0;
    }

    public boolean add(T content, Integer position){

        if(position > getSize() || position < 0)
            return Boolean.FALSE;

        Node<T> newNode = new Node<>(content);

        if(!fullIs()) {
            this.head = newNode;
            this.tail =  newNode;
            tail.setNext(this.head);
        }else{
            if(position == 0){

                newNode.setNext(this.head);
                this.head = newNode;
                this.tail.setNext(head);

            }else if(position.equals(this.size)){

                this.tail.setNext(newNode);
                this.tail = newNode;
                this.tail.setNext(head);

            }else{

                Node<T> current = this.head;
                Node<T> previous = null;

                for (int i = 0; i < position; i++) {
                    previous = current;
                    current = current.getNext();
                }

                previous.setNext(newNode);
                newNode.setNext(current);
            }

        }

        this.size++;
        return Boolean.TRUE;

    }

    public boolean removeByPosition(Integer position){

        if(!fullIs() || position < 0 || position >= getSize())
            return Boolean.FALSE;

        if(position == 0){

            if(this.size == 1)
                clear();
            else{
                Node<T> aux = this.head;
                this.head = this.head.getNext();
                this.tail.setNext(head);
                aux.setNext(null);
            }
        }else{

            Node<T> current = this.head;
            Node<T> previous = null;

            while(position > 0){
                previous = current;
                current = current.getNext();
                position--;
            }

            previous.setNext(previous.getNext().getNext());

            if(current.equals(this.tail))
                this.tail = previous;

            current.setNext(null);
        }

        this.size--;
        return Boolean.TRUE;
    }

    public void clear(){
        this.size = 0;
        this.tail = null;
        this.head = null;
    }

    public Integer getSize() {
        return size;
    }

    public Node<T> getTail() {
        return tail;
    }

    public Node<T> getHead() {
        return head;
    }

    @Override
    public String toString() {
        if (!fullIs()) {
            return "List is empty";
        }

        StringBuilder circularListString = new StringBuilder();
        Node<T> current = this.head;

        do {
            circularListString.append(current.getContent().toString()).append(" -> ");
            current = current.getNext();
        } while (current != this.head);

        return circularListString.append("(head)").toString();
    }

}
