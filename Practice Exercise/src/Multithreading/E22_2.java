package Multithreading;

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class myStack{
    Lock myLock = new ReentrantLock();
    LinkedList<Integer>list = new LinkedList<Integer>();
    void push(int element){
        myLock.lock();
        list.add(element);
        myLock.unlock();
    }
    Integer pop(){
        myLock.lock();
        Integer num = list.pop();
        myLock.unlock();
        return num;
    }
    Boolean isEmpty(){
        myLock.lock();
        Boolean ap = list.isEmpty();
        myLock.unlock();
        return ap;
    }
}

public class E22_2 {
    public static void main(String[] args) {
        myStack asif = new myStack();
        asif.push(10);
        System.out.println(asif.pop());
    }
}
