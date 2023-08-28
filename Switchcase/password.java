package Switchcase;
import java.util.Scanner;
public class password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String correctPassword = "Vik@";
        int attempts = 3;
        System.out.println("Enter Your Password:--");
        correctPassword = sc.nextLine();

        System.out.println("Set Password:---");
        correctPassword =sc.nextLine();

    }
}
