package jasmin;

import java.util.Scanner;

public class EvenOdd {
    public static void check_even_odd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= scanner.nextInt();
        check_even_odd(n);
    }
}
