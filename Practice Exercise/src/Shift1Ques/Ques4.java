package Shift1Ques;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("hello.txt"));
        //first read all lines in the file
        ArrayList<String>list = new ArrayList<String>();
        while (sc.hasNextLine()){
            String now = sc.nextLine();
            list.add(now);
        }
        sc.close();
        //now print the lines
        PrintWriter pr = new PrintWriter(new File("hello.txt"));
        for(int i = 0; i < list.size() ; i++){
            pr.println("/*" + i + "*/" + list.get(i));
        }
        pr.close();
    }
}
