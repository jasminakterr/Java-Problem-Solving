package jasmin;

import java.util.Scanner;

public class Arithmetic_Operator {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
       System.out.println("Enter the 1st number:");
       int a= scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int b= scanner.nextInt();
        int add= a+b;
        int sub= a-b;
        int mul= a*b;
        int div= a/b;
        int mod= a%b;
        System.out.println("Addition:"+add);
        System.out.println("Subtraction:"+sub);
        System.out.println("Multiplication:"+mul);
        System.out.println("Division:"+div);
        System.out.println("Modulus:"+mod);


    }
}
