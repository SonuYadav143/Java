package Client.Client1;
import  java.util.Scanner;
import java.util.InputMismatchException;
public class p4n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        int height;
        int BMI;
        try {
            System.out.println("Enter Your Name:-");
            name = sc.next();
            //System.out.println(name);
            System.out.println("Enter Your Age:-");
            age = sc.nextInt();
            System.out.println("enter the height");
            height=sc.nextInt();
            BMI=age/height;
            System.out.println(BMI);
            // System.out.println(age);

        } catch
            (InputMismatchException e){

            System.out.println("error");

        }
        catch
        (ArithmeticException e) {
            System.out.println("zeroooo");

        }
        }
    }