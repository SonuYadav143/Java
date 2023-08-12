package Conditional_Stam;
import java.util.Scanner;

public class Switch_char {
    public static void main(String[] args) {
        char sonu;
        Scanner sm=new Scanner(System.in);

        System.out.println("Enter One to seve day:--");
        sonu=sm.next().charAt(0);

        switch (sonu){
            case 'm':
                        System.out.println("Monday:-");
                        break;
            case 't':
                        System.out.println("tuesady:");
                        break;
            case 'w':
                        System.out.println("wenesday");
                        break;
            case 'T':
                        System.out.println("thusday");
                        break;
            case 'f':   
                        System.out.println("Friday");
                        break;
            case 's':
                        System.out.println("satuday");
                        break;
            case 'S':
                        System.out.println("sunday");
                        
            default:
                    System.out.println("Enter to M to S");            


        }

        
    }
    
}
