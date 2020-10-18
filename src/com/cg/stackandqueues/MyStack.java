package com.cg.stackandqueues;

public class MyStack <E>  {
    MyLinkedList myLinkedList=new MyLinkedList();

    public void push(E data){
        myLinkedList.add(data);
    }

    public E peek(){
        if(myLinkedList.head==null){
            System.out.println("Stack is empty");
        return null;
        }
        else
        return (E) myLinkedList.head.data;
    }
    public  void pop(){
        if(myLinkedList.head==null)
            System.out.println("Stack is empty");
        else
        myLinkedList.pop();
    }

    public void printStack(){
        if(myLinkedList.head==null)
            System.out.println("Stack is empty");
        else
        myLinkedList.printList();
    }
}

