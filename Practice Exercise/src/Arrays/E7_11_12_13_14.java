package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

class Sequence
{
    private int[] values;
    public Sequence(int size) { values = new int[size]; }
    public void set(int i, int n) { values[i] = n; }
    public int get(int i) { return values[i]; }
    public int size() { return values.length; }
    //E7.11
    public boolean equals(Sequence other){
        if(this.size()  != other.size()) return false;
        for(int i = 0;i < other.size(); i++){
            if(this.get(i) != other.get(i)){
                return false;
            }
        }
        return true;
    }
    //E7.12
    public ArrayList onlyUniques(){
        ArrayList<Integer>list = new ArrayList<>();
        int[] values2 = values;
        Arrays.sort(values2);
        for(int i = 0; i < values2.length; i++){
            if(i == 0) list.add((values2[i]));
            else if(values2[i] != values2[i-1]) list.add(values2[i]);
        }
        return list;
    }
    public boolean sameValues(Sequence other){
        ArrayList one = this.onlyUniques();
        ArrayList two = other.onlyUniques();
        return one.equals(two);
    }
    //E7.13
    public boolean isPermutationOf(Sequence other){
        int[] myValue = values;
        Arrays.sort(myValue);
        int[] otherValue = other.values;
        Arrays.sort(otherValue);
        return myValue.equals(otherValue);
    }
    //E7.14
    public Sequence sum(Sequence other){
        int n = this.values.length;
        int m = other.values.length;
        int mx = Math.max(n,m);
        Sequence jog = new Sequence(mx);
        for(int i = 0; i < mx; i++){
            int one = 0, two = 0;
            one = this.get(i);
            two = other.get(i);
            jog.set(i, one+two);
        }
        return jog;
    }
}

public class E7_11_12_13_14 {
    public static void main(String[] args) {

    }
}
