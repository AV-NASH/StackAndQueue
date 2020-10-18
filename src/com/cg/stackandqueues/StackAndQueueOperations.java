package com.cg.stackandqueues;

public class StackAndQueueOperations {
    public static void main(String[] args) {
        System.out.println("Welcome to stack and queue operations");
        System.out.println("Stack Operations");
        MyStack myStack=new MyStack();
        myStack.push(70);
        myStack.push(30);
        myStack.push(56);
        myStack.printStack();
        System.out.println("----");
        System.out.println("Element at top of stact is.."+myStack.peek()+"\nAfter pop");
        myStack.pop();
        myStack.printStack();

        System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x\n"+"Queue operations");
        MyQueue myQueue=new MyQueue();
        myQueue.enqueue(56);
        myQueue.enqueue(30);
        myQueue.enqueue(70);
        myQueue.printQueue();
        myQueue.dequeue();
        System.out.println("After dequeue");
        myQueue.printQueue();
    }
}
