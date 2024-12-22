package jasmin;

import java.util.Scanner;

public class If_Else_Condition {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a= scanner.nextInt();
        System.out.println("Enter the 2nd number:");
        int b= scanner.nextInt();
        int add= a+b;
        int sub= a-b;
        int mul= a*b;
        int div= 0;
        int mod= a%b;
        // if else condition

        if(b!=0) {
            div = a / b;
        }
        else {
            System.out.println("Division by 0 is not allowed");
        }
        System.out.println("Addition:"+add);
        System.out.println("Subtraction:"+sub);
        System.out.println("Multiplication:"+mul);
        System.out.println("Division:"+div);
        System.out.println("Modulus:"+mod);


    }
}
