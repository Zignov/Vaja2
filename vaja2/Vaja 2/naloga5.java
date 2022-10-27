import java.util.Scanner;


public class naloga5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double medium = 0;
        double big;
        double small = 0;


        System.out.println("Enter number a:");
        double a = sc.nextDouble();

        System.out.println("Enter number b:");
        double b = sc.nextDouble();

        System.out.println("Enter number c:");
        double c = sc.nextDouble();

        if (a>b){
            if (a>c){
                big=a;
            }
            else{
                big=c;
            }
        }
        else if(b>c){
            big=b;
        }
        else{
            big=c;
        }


        if (big == a){
            if(b>c){
                medium=b;
                small=c;
            }
            else{
                medium=c;
                small=b;
            }
        }


        if (big == b){
            if(a>c){
                medium = a;
                small = c;
            }
            else{
                medium = c;
                small = a;
            }
        }

        if (big == c){
            if(b>a){
                medium = b;
                small = a;
            }
            else{
                medium = a;
                small = b;
            }
        }


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("Najvecja = " + big);
        System.out.println("Srednja = " + medium);
        System.out.println("Najmanjsa = " + small);

    }



}