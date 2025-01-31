package jasmin;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        int t;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second value:");
        int num2 = scanner.nextInt();
        System.out.println("Before swapping numbers are: "+num1 +"  "+ num2);
        /*swapping */
        t = num1;
        num1 = num2;
        num2 = t;
        System.out.println("After swapping numbers are: "+num1 +"   " + num2);
    }
}

