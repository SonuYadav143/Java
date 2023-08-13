package Loop_Conditation_stam;
import java.util.Scanner;
public class do_while_add_userInput {
    public static void main(String[] args) {
        char choice;
        Scanner sc=new Scanner(System.in);
        
        do{
            System.out.print("Enter First Number:--");
            int number1=sc.nextInt();

            System.out.print("Enter Seond Number:--");
            int number2=sc.nextInt();

            int sum=number1+number2;
            System.out.print("Sum_Add number:--"+sum);
            sum=sc.nextInt();

            System.out.print("Do you want to perform the operation again? (Y/N): ");
            choice=sc.next().charAt(0);

        }while(choice=='Y'|| choice=='y');
    }
    
}
