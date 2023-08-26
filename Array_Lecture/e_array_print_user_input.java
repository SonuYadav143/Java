package Array_Lecture;
import java.util.Scanner;
public class e_array_print_user_input {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);{
            System.out.println("Enter your number:--");
            int size=sc.nextInt();

            int [] array =new int[size];
            for(int i=1; i<=size; i++){
            array[i] =sc.nextInt();
            }

            for(int i=1; i<size; i++){
                System.out.println(array[i]);
            }
        }

    }
}
