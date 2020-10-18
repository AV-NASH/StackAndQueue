package com.cg.stackandqueues;

public class StackAndQueueOperations {
    public static void main(String[] args) {
        System.out.println("Welcome to stack and queue operations");
        MyStack myStack=new MyStack();
        myStack.push(70);
        myStack.push(30);
        myStack.push(56);
        myStack.printStack();
        System.out.println("----");
        System.out.println("Element at top of stact is.."+myStack.peek()+"\nAfter pop");
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.printStack();
    }
}
