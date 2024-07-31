package org.example;

public class BinNode<T extends Comparable<T>> {

    private T content;
    private BinNode<T> nodeLeft;
    private BinNode<T> nodeRight;

    public BinNode(T inputContent){
        this.content = inputContent;
        this.nodeLeft = this.nodeRight = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public BinNode<T> getNodeLeft() {
        return nodeLeft;
    }

    public void setNodeLeft(BinNode<T> nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public BinNode<T> getNodeRight() {
        return nodeRight;
    }

    public void setNodeRight(BinNode<T> nodeRight) {
        this.nodeRight = nodeRight;
    }

    @Override
    public String toString() {
        return "BinNode{" +
                "content=" + content +
                ", nodeLeft=" + nodeLeft +
                ", nodeRight=" + nodeRight +
                '}';
    }


}
