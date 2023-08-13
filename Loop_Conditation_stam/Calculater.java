package Loop_Conditation_stam;
import java.util.Scanner;
public class Calculater {
    public static void main(String[] args) {
        int number1,number2;
        char choice;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter First one number:--");
        number1=sc.nextInt();

        System.out.print("Enter Your Second number:--");
        number2=sc.nextInt();

        System.out.println("Available operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.println("Enter your choice (1-4): ");
         choice = sc.next().charAt(0);
        

        int results=0;

        switch(choice){
        
            case '+' : results = number1 + number2;
            break;

             case '-' : results = number1 - number2;
            break;

             case '*' : results= number1 * number2;
            break;

             case '/' : results = number1 / number2;
            break;

            default : System.out.println("Select Only + , - , * , / ");
            break;  

        }
        System.out.println("Your Result is:--" + results);
    }
    
}
