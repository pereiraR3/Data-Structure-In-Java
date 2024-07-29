package org.example.data_structure_queue;

public class Queue<T> {

    private Node<T> front;
    private Node<T> last;
    private Integer size;

    public Queue(){
        this.front = null;
        this.last = null;
        this.size = 0;
    }

    public Node<T> getFront() {
        return front;
    }

    public Node<T> getLast() {
        return last;
    }

    public Integer getSize() {
        return size;
    }

    public boolean itsFull(){
        return this.size != 0;
    }

    public void enqueue(T content){

        Node<T> newNode = new Node<T>(content);
        if(itsFull()){
            this.last.setNext(newNode);
        }else{
            this.front = newNode;
        }
        this.last = newNode;
        this.size++;

    }

    public boolean dequeue(){

        if(!itsFull())
            return Boolean.FALSE;

        Node<T> aux = this.front;
        this.front = aux.getNext();
        aux.setNext(null);

        if(this.front == null)
            this.last = null;

        this.size--;

        return Boolean.TRUE;
    }

    public void clear(){
        this.front = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public String toString() {

        Node<T> aux = front;
        StringBuilder queue = new StringBuilder();

        queue.append("  ");

        while(itsFull() && aux != null){
            queue.append(aux.getContent().toString()).append(" | ");
            aux = aux.getNext();
        }

        if(queue.isEmpty()) queue.append(" isEmpty");

        return " --------------  \n"
                + " Info. Queue: \n"
                + " --------------  \n"
                + queue +
                 "\n --------------  \n";

    }
}
