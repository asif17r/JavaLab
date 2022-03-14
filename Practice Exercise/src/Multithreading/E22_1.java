
package Multithreading;
import java.util.LinkedList;
class addElement implements Runnable{
    LinkedList<Integer>list;
    public addElement(LinkedList<Integer>givenList){
        list = givenList;
    }
    @Override
    public void run() {
        list.add(10);  //add element
    }
}
class removeElement implements Runnable{
    LinkedList<Integer>list;
    public removeElement(LinkedList<Integer>givenList){
        list = givenList;
    }
    @Override
    public void run() {
        if(list.size() == 0){
            System.out.println("Trying to remove element from empty list");
        }
        else list.remove();  //removes the 1st element
    }
}

public class E22_1 {
    static LinkedList<Integer>list = new LinkedList<Integer>();
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            Thread t1 = new Thread(new addElement(list));
            Thread t2 = new Thread(new removeElement(list));
            t1.start();
            t2.start();
        }
        /**
         * IF we run this code it will print
         *    "Trying to remove element from empty list"
         * one or multiple times. But this shouldn't happen
         * because we first add an element and then remove in the for loop.
         *
         * This is happening because thread can execute in any order. That largely
         * depends on the code environment and the operating system.
         *
         * Corruption of the list is demonstrated.
         */
    }
}
