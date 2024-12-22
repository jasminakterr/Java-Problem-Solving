package jasmin;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a= scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int b= scanner.nextInt();
        System.out.println("Enter the 3rd number:");
        int c= scanner.nextInt();
        int g;
        if(a>=b && a>=c){
            g=a;
        } else if (b>=a && b>=c) {
            g=b;

        }
        else{
            g=c;
        }
        System.out.println("The greatest number is:"+g);

    }
}
