package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class E11_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File hello = new File("hello.txt");
        PrintWriter wr = new PrintWriter(hello);
        wr.print("Helloooo World, Nasir");
        wr.close();
        Scanner sc = new Scanner(hello);
        System.out.println(sc.nextLine());
        sc.close();
    }
}
