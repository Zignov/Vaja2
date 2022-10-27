import java.util.Scanner;
import java.lang.Math;


public class naloga4{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        double num = sc.nextDouble();
        String tip;
        String deljivost;
        
        if (num%2 == 0){
            deljivost = "sodo";
        }
        else{
            deljivost = "liho";
        }

        if (Math.abs(num)==num){
            tip = "pozitivno";
        }
        else {
            tip = "negativno";
        }


        System.out.println("Stevilo " + num + " je " + deljivost + " in " + tip);


    }
}