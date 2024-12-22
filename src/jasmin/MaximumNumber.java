package jasmin;

import java.util.Scanner;

public class MaximumNumber {
    public static int check_maximum(int a, int b, int c){
        if(a>=b && a>=c){
            return a;
        } else if (b>=a && b>=c) {
            return b;

        }
        else{
            return c;
        }
    }
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a= scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int b= scanner.nextInt();
        System.out.println("Enter the 3rd number:");
        int c= scanner.nextInt();
        int g= check_maximum(a, b, c);
        System.out.println("The maximum number is:"+g);
    }
}
