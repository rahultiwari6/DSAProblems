import java.util.*;
public class  Power {

    public static double CalPower(double x, double n){

        if(n==0){
            return 1.0;
        }
        // even power
        if(n%2==0){
            return CalPower(x*x,n/2);
        }
        // Odd Power
        if(n%2==1){
            return x*CalPower(x,n-1);
        }
        // Negative Power
        return 1/CalPower(x,-n);

    }
    public static void main(String[] args) {
        double x=4;
        double n=-2;
        double pow= CalPower(x,n);
        System.out.println(pow);
    }
}
