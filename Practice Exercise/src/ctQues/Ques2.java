package ctQues;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        System.out.print("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int a = y%19;
        int b = y/100;
        int c = y%100;
        int d = b/4;
        int e = b%4;
        int g = (8*b + 13)/25;
        int h = (19*a + b - d - g + 15)%30;
        int j = c/4;
        int k = c%4;
        int m = (a + 11*h)/319;
        int r = (2*e + 2*j - k - h + m + 32)%7;
        int n = (h - m + r + 90)/25;
        int p = (h - m + r + n + 19)%32;
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Ester Sunday is " + months[n] + " " + Integer.toString(p));
    }
}
