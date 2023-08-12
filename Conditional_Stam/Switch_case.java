package Conditional_Stam;
import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one two seven day:--");
        day=sc.nextInt();

        switch(day){
            case 1:
                    System.out.println("Monday");
                    break;
            case 2:
                    System.out.println("Tuesday");
                    break;
            case 3:
                    System.out.println("wenesday");
                    break;
            case 4:
                    System.out.println("thusday");
                    break;
            case 5:
                    System.out.println("friday");
                    break;
            case 6:
                    System.out.println("saturday");
                    break;
            case 7:
                    System.out.println("sunday");
                    break;
            default :
                    System.out.println("======Invalid Day Plaese Enter 1 To 7=======");                                                     
        }

    }
}
