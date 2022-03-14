package Arrays;
class Sequence
{
    private int[] values;
    public Sequence(int size) { values = new int[size]; }
    public void set(int i, int n) { values[i] = n; }
    public int get(int i) { return values[i]; }
    public int size() { return values.length; }
    public boolean equals(Sequence other){
        if(this.size()  != other.size()) return false;
        for(int i = 0;i < other.size(); i++){
            if(this.get(i) != other.get(i)){
                return false;
            }
        }
        return true;
    }
}

public class E7_11 {
    public static void main(String[] args) {

    }
}
