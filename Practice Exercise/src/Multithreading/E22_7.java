package Multithreading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class WordCount implements Runnable{
    String filename;
    WordCount(String givenFile){
        filename = givenFile;
    }
    public void count() throws FileNotFoundException {
        Scanner in = new Scanner(new File(filename));
        int cnt = 0;
       while(in.hasNext()){
            String one = in.next();
            cnt += one.length();
        }
        System.out.println(filename + ": "+cnt);
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

public class E22_7 {
    public static void main(String[] args) {
        for(String a: args){
            Thread t1 = new Thread(new WordCount(a));
            t1.start();
        }
    }
}
