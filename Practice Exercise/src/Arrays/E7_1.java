package Arrays;

import java.util.Random;

public class E7_1 {
    public static void main(String[] args) {
        Random generator = new Random();
        int[] arr = new int[10];
        for(int i = 0;i < 10; i++){
            arr[i] = generator.nextInt(20);
        }
        for(int i = 0; i < 10; i++){
            if(i%2 == 0){
                System.out.print(Integer.toString(arr[i]) + " ");
            }
        }
        System.out.println("");
        for(int i = 0; i < 10; i++){
            if(i%2 == 1){
                System.out.print(Integer.toString(arr[i]) + " ");
            }
        }
        System.out.println("");
        for(int i = 9; i >= 0; i--){
            System.out.print(Integer.toString(arr[i])+" ");
        }
        System.out.println("");
        System.out.println(arr[0] +" "+arr[9]);
    }
}
