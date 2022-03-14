package Arrays;

import java.util.ArrayList;

class Sequence2
{
    private ArrayList<Integer> values;
    public Sequence2() { values = new ArrayList<Integer>(); }
    public void add(int n) { values.add(n); }
    public String toString() { return values.toString(); }
    public Sequence2 append(Sequence2 other){
        Sequence2 newSeq = new Sequence2();
        for(Integer a: this.values){
            newSeq.add(a);
        }
        for(Integer a: other.values){
            newSeq.add(a);
        }
        return newSeq;
    }
}

public class E7_22 {
    public static void main(String[] args) {

    }
}
