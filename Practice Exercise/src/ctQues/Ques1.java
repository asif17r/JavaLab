package ctQues;
class Ballon{
    double radius = 0.0;
    public void inflate(double amount){
        radius += amount;
    }
    public Double getVolume(){
        //formula is (4/3)pir^3
        double ans = (4/3)*Math.PI*radius*radius*radius;
        return ans;
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Ballon ashiq = new Ballon();
        ashiq.inflate(50);
        System.out.println(ashiq.getVolume());
    }
}
