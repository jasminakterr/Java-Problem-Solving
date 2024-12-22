package jasmin;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value:");
        int n= scanner.nextInt();
        int s=0;
        for(int i=0;i<=n;i++){
            s+=i;
            System.out.println(i);
        }
        System.out.println("The sum of natural numbers is: " + s);
    }
}


