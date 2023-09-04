package Client.Client1;
import java.util.InputMismatchException;
import  java.util.Scanner;
public class taxt1 {
    public static void main(String[] args) {
        try {
            String name;
            int age;
            int Height;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name:-");
            name = sc.next();
            System.out.println("Enter your age:-");
            age = sc.nextInt();
            System.out.println("Enter Your height:-");
            Height = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("error");
        }
    }
}

///Execution; Headings.