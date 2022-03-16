import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SearchWord implements Runnable{
    String srcWord, filename;
    SearchWord(String one, String two){
        srcWord = one;
        filename = two;
    }
    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(new File(filename));
            while(sc.hasNextLine()){
                String now = sc.nextLine();
                if(now.contains(srcWord)){
                    System.out.println(filename + ": " + now);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

public class P22_1{
    public static void main(String[] args) {
        String srcWord = args[0];
        for(int i =1; i < args.length;i++){
            SearchWord sr = new SearchWord(srcWord, args[i]);
            Thread t1 = new Thread(sr);
            t1.start();
        }
    }
}
