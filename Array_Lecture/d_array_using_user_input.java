package Array_Lecture;
import java.util .Scanner;
public class d_array_using_user_input {
public static void main(String [] args){
    Scanner sc =new Scanner(System.in);

    System.out.println("Enter number:-");
    int  number = sc.nextInt();

     int[] array = new int [number];

    for(int i=1; i<=number; i++){
        System.out.println(array[i]);
    }

 }
}
