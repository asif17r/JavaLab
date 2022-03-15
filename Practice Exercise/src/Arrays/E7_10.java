package Arrays;

class ArrayMethods{
    private int[] values;
    public ArrayMethods(int[] initialValues){
        values = initialValues;
    }
    //number a
    public void swapFirstAndLast(){
        int n = values.length;
        int temp = values[0];
        values[0] = values[n-1];
        values[n-1] = temp;
    }
    //number b
    public void shiftRight(){
        int n = values.length;
        values[0] = values[n-1];
        for(int i = 1;i < n; i++){
            values[i] = values[i-1];
        }
    }
    //number c
    public void zeroAll(){
        for(int i = 0; i < values.length; i++) values[i] = 0;
    }
}

public class E7_10 {
    public static void main(String[] args) {

    }
}
