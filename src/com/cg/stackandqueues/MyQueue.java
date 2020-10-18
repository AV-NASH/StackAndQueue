package com.cg.stackandqueues;

import java.util.LinkedList;

public class MyQueue<E>  {
    MyLinkedList myLinkedList=new MyLinkedList();

    public void enqueue(E data){
        myLinkedList.append(data);
    }

    public  void dequeue(){
        if(myLinkedList.head==null)
            System.out.println("Queue is empty");
        else
            myLinkedList.pop();
    }

    public void printQueue(){
        if(myLinkedList.head==null)
            System.out.println("Stack is empty");
        else
            myLinkedList.printList();
    }
}
