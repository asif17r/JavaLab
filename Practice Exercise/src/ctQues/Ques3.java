package ctQues;

class ComboLock {
    int secret1 , secret2, secret3;
    int[] userSecret = new int[3];
    int passnumber = 0;
    int dial = 0;
    int lasttime = -1;
    public ComboLock(int secret1, int secret2, int secret3){
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }
    public void reset(){
        dial = 0;
        passnumber = 0;
    }
    public void turnLeft(int ticks){
        if(lasttime == 0){
            userSecret[passnumber] = dial;
            passnumber++;
        }
        dial += ticks;
        dial %= 40;
        lasttime = 1;
    }
    public void turnRight(int ticks){
        if(lasttime == 1){
            userSecret[passnumber] = dial;
            passnumber++;
        }
        dial -= ticks;
        while(dial < 0) dial += 40;
        lasttime = 0;
    }
    public boolean open(){
        userSecret[passnumber] = dial;
        if(secret1 == userSecret[0] && secret2 == userSecret[1] && secret3 == userSecret[2]){
            return true;
        }else{
            return false;
        }
    }
}

public class Ques3 {
    public static void main(String[] args) {
        ComboLock ashiq = new ComboLock(5,10,15);
        ashiq.turnLeft(5);
        ashiq.turnRight(35);
        ashiq.turnLeft(5);
        if(ashiq.open()){
            System.out.println("Unlocked");
        }else{
            System.out.println("Wrong Password");
        }
    }
}
