package InputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E11_7 {
    public static void main(String[] args) throws FileNotFoundException {
        String filname;
        System.out.println("Enter file name: ");
        Scanner sc = new Scanner(System.in);
        filname = sc.next();
        sc.close();
        Scanner sc2 = new Scanner(new File(filname));
        //i have to print number of lines, words and charcters
        Integer cntLine = 0, cntWord = 0, cntChar = 0;
        while(sc2.hasNextLine()){
            String line = sc2.nextLine();
            cntLine++;
            String[] arr = line.split(" ");
            cntWord += arr.length;
            for(String a: arr){
                cntChar += a.length();
            }
        }
        System.out.println("Number of lines : " + cntLine.toString());
        System.out.println("Number of Words: " +  cntWord.toString());
        System.out.println("Number of Chars: "+ cntChar.toString());
    }
}
