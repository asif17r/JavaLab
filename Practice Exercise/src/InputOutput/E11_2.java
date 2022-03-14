package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class E11_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("hello.txt"));
        String all = "";
        while(sc.hasNextLine()){
            String tmp = sc.nextLine();
            if(!tmp.isEmpty()){
                all += tmp + "\n";
            }
        }
        sc.close();
        PrintWriter pr = new PrintWriter(new File("hello.txt"));
        pr.print(all);
        pr.close();
    }
}
