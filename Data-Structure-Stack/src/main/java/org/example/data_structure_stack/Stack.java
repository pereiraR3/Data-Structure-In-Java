package org.example.data_structure_stack;

public class Stack<T> {

    private Node<T> nodeTop;

    public Stack(){
        this.nodeTop = null;
    }

    public void push(Node<T> node){
        if(this.isEmpty())
            nodeTop = node;
        else{
            Node<T> auxStack = nodeTop;
            node.setNext(auxStack);
            nodeTop = node;
        }

    }

    public Node<T> getNodeTop(){
        return nodeTop;
    }

    public void pop(){
        if(!this.isEmpty()){
            Node<T> auxNode =  nodeTop;
            nodeTop = nodeTop.getNext();
            auxNode.setNext(null);
            auxNode = null;
        }
    }

    public Boolean isEmpty(){
        return nodeTop == null ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override
    public String toString() {

        String returnMessage = "\n==== Stack ====\n";

        if(isEmpty())
            return "Stack is Empty";
        else{
            Node<T> auxNode = nodeTop;
            while(true){
                if(auxNode != null){
                    returnMessage += "[Node {Content: " + auxNode.getContent() + " ]}\n";
                    auxNode = auxNode.getNext();
                }else{
                    break;
                }

            }
        }
        returnMessage += "==== == ====\n";
        return returnMessage;
    }
}
