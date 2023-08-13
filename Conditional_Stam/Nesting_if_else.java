package Conditional_Stam;
import java.util.Scanner;
public class Nesting_if_else {
    public static void main(String[] args) {
        int results;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number:--");
    results=sc.nextInt();
    if(results>=0 && results <=35){
        System.out.println("Parsan is Fails");
    }else if(results>=35 && results<=45){
        System.out.println("Parson is Pass");
    }else if(results>=46 && results<=59){
        System.out.println( "Parson is pass as on Second  class:--");
    }else if(results>=60 && results<=79){
        System.out.println("Parson is pass as on First class:--");
    }else if(results>=80 && results<=100){
        System.out.println("distance");
    }else{
        System.out.println("Please enter 1 to 100 number:--");
    }
    
    }
}
