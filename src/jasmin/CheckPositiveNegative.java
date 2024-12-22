package jasmin;

import java.util.Scanner;

public class CheckPositiveNegative {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= scanner.nextInt();
        if(n>0){
            System.out.println("The number is positive");
        }
        else if (n<0)
        {
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The number is zero");
    }

    }
}
