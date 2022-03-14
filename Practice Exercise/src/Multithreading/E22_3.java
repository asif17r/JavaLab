package Multithreading;

import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class myQueue{
    LinkedList<String>list = new LinkedList<>();
    synchronized void add(){
        list.add(new Date().toString());
    }
    synchronized String remove(){
        return list.pop();
    }
    synchronized int size(){
        return list.size();
    }
}
class addEle implements Runnable{
    myQueue asif;
    public addEle(myQueue ashiq){
        asif = ashiq;
    }
    @Override
    public void run() {
        while(asif.size() == 10){}
        while(asif.size() < 10) asif.add();
    }
}
class remEle implements Runnable{
    myQueue asif;
    public remEle(myQueue ashiq){
        asif = ashiq;
    }
    @Override
    public void run() {
        while(asif.size() == 0) {}
        while(asif.size() != 0) {
            System.out.println(asif.remove());
        }
    }
}

public class E22_3 {
    public static void main(String[] args) throws InterruptedException {
        myQueue asif = new myQueue();
        for(int i = 1;i <= 100; i++){
            System.out.println(i);
            Thread t1 = new Thread(new addEle(asif));
            Thread t2 = new Thread(new remEle(asif));
            t1.start();
            t2.start();
            t1.join(); //waiting for threads to finish their work
            t2.join();
        }
    }
}
