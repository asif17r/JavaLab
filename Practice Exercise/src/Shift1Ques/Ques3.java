package Shift1Ques;

interface NumberFormatter{
    String format(int n);
}
class DefaultFormatter implements NumberFormatter{
    @Override
    public String format(int n) {
        return Integer.toString(n);
    }
}
class DecimalSeparatorFormatter implements NumberFormatter{
    @Override
    public String format(int n) {
        String str = Integer.toString(n);
        StringBuilder nw = new StringBuilder();
        int idx = 0;
        for(int i = str.length()-1; i >= 0; i--){
            if(idx != 0 && idx%3 == 0 && str.charAt(i) != '-'){
                nw.append(",");
            }
            nw.append(str.charAt(i));
            idx++;
        }
        nw.reverse();
        return nw.toString();
    }

}
class AccountingFormatter implements NumberFormatter{
    @Override
    public String format(int n) {
        String str = Integer.toString(n);
        if(str.charAt(0) == '-'){
            str = str.substring(1,str.length());
            str = "(" + str + ")";
        }
        return str;
    }
}
class BaseFormatter implements NumberFormatter{
    int n; //this is base
    BaseFormatter(int n){
        this.n = n;
    }
    @Override
    public String format(int n) {
        int gun = 1;
        if(n < 0){
            n = -n;
            gun = -1;
        }
        StringBuilder str = new StringBuilder();
        while(n > 0){
            str.append(Integer.toString(n%this.n));
            n /= this.n;
        }
        if(gun == -1) str.append("-");
        str.reverse();
        return str.toString();
    }
}

public class Ques3{
    public static void main(String[] args) {
        int n = -1000000;
        DefaultFormatter as = new DefaultFormatter();
        DecimalSeparatorFormatter h = new DecimalSeparatorFormatter();
        AccountingFormatter i = new AccountingFormatter();
        BaseFormatter q = new BaseFormatter(2);

        System.out.println(as.format(n));
        System.out.println(h.format(n));
        System.out.println(i.format(n));
        System.out.println(q.format(n));
    }
}
