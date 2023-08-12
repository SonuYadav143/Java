package Conditional_Stam;
import java.util.Scanner;
public class if_else_odd_even {
    public static void main(String[] args) {
        int number;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter one number:--");
        number=sc.nextInt();
        if(number>=0){
            System.out.println("positive number:-");

        if(number>=0){
            System.out.println("even");
        }else{
            System.out.println("odd number:--");
        }
        }else{
            System.out.println("negative number:--");
        }

    }
    
}
