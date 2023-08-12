package Conditional_Stam;
import java.util.Scanner;
public class If_else_cont {
    public static void main(String[] args) {
        int  age;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Yur Age:-");
        age=sc.nextInt();
        if(age>18){
            System.out.println("Adult:--");
        }
        else{
            System.out.println("Not Adult:--");
        }

    }
    
}
