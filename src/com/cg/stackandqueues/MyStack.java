package com.cg.stackandqueues;

public class MyStack <E>  {
    MyLinkedList myLinkedList=new MyLinkedList();

    public void push(E data){
        myLinkedList.add(data);
    }

    public void printStack(){
        myLinkedList.printList();
    }
}

