package Switchcase;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int result;
        int number1,number2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:---");
        number1 = sc.nextInt();
        System.out.println("Enter Your Second :---");
        number2 = sc.nextInt();

        System.out.println("Abl");
        System.out.println("Available operators:");
        System.out.println("1. Addition (+)");
        System.out.println("2. subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.println("Enter your choice (1-4): ");
         int choice = sc.nextInt();
        switch (choice){
            case 1:
                result=number1 + number2 ;
                System.out.println("Add:---" + result);
                break;
            case 2:
                result=number1-number2;
                System.out.println("sub:---"+result);
            case 3:
                result=number1*number2;
                System.out.println("mul:--"+result);
                break;
            case 4:
                result=number1/number2;
                System.out.println("div:--"+result);
                break;
            default:
                System.out.println("Enter ADD,div,mul,sub:---");
        }
    }

}
