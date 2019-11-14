package com.learn.linkedlist;

public class Node<T> {

     //存放数据的变量
    private T data;
    //存放结点的变量,默认为null
    private Node<T> next;

    //构造方法，在构造时就能够给data赋值
    public  Node(){
        this.data = null;
        next = null;
    }

    public Node(T data){
        this.data = data;
        next = null;
    }

    public T getData() {
        return data;
    }


    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}