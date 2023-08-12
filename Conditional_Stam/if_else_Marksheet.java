package Conditional_Stam;
import java.util.Scanner;
public class if_else_Marksheet{
    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:--");
        marks=sc.nextInt();

        if(marks>=0 && marks<=30){

            System.out.println("Fails");
        }else if(marks>30 && marks<=100){

            System.out.println("pass marks:-");
        }else{
            System.out.println("wrong marks:--");
        }    
    
    }
}
