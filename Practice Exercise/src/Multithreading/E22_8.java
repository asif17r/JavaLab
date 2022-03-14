package Multithreading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Combiner{
    Integer total = 0;
    Lock myLock = new ReentrantLock();
    void combine(int count){
        myLock.lock();
        total += count;
        myLock.unlock();
    }
}

class WordCount2 implements Runnable{
    Combiner me;
    String filename;
    WordCount2(String givenFile, Combiner me){
        filename = givenFile;
        this.me = me;
    }

    public void count() throws FileNotFoundException {
        Scanner in = new Scanner(new File(filename));
        int cnt = 0;
        while(in.hasNext()){
            String one = in.next();
            cnt += one.length();
        }
        System.out.println(filename + ": "+cnt);
        me.combine(cnt);
    }
    @Override
    public void run() {
        try {
            count();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

public class E22_8 {
    public static void main(String[] args) throws InterruptedException {
        Combiner me = new Combiner();
        ArrayList<Thread>myThreads = new ArrayList<>();
        for(String a: args){
            Thread t1 = new Thread(new WordCount2(a,me));
            t1.start();
            myThreads.add(t1);
        }
        for(Thread a: myThreads) {
            a.join(); //wait to finish
        }
        System.out.println("Total counts: " + me.total.toString());
    }
}
