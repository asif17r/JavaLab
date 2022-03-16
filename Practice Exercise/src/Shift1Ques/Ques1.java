package Shift1Ques;
class Table{
    private int[][] values;
    public Table(int rows, int columns){
        values = new int[rows][columns];
    }
    public void set(int i,int j, int n){
        values[i][j] = n;
    }
    public boolean valid(int i, int j){
        //this will return true if cell i,j is valid
        //for example -1, 2 is invalid
        //1,2 is valid when n= 3, m =4;
        //when n = 2, m =3 (that means the table is 2*3) i = 5,j= 1 is invalid
        int n = values.length;
        int m = values[0].length;
        if(i >= 0 && i < n && j >= 0 && j < m) return true;
        return false;
    }
    public double nighborAverage(int i,int j){
        double sum = 0.0;
        int n = values.length;
        int m = values[0].length;
        int cnt = 0;
        if(valid(i-1,j-1)){
            sum += values[i-1][j-1];
            cnt++;
        }
        if(valid(i-1,j+1)){
            sum += values[i-1][j+1];
            cnt++;
        }if(valid(i-1,j)){
            sum += values[i-1][j];
            cnt++;
        }if(valid(i,j-1)){
            sum += values[i][j-1];
            cnt++;
        }if(valid(i,j+1)){
            sum += values[i][j+1];
            cnt++;
        }if(valid(i+1,j-1)){
            sum += values[i+1][j-1];
            cnt++;
        }if(valid(i+1,j)){
            sum += values[i+1][j];
            cnt++;
        }if(valid(i+1,j+1)) {
            sum += values[i + 1][j + 1];
            cnt++;
        }
        return sum/cnt;
    }
}

public class Ques1 {
    public static void main(String[] args) {

    }
}
