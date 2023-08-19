package ClassFunction.Shop;
import java.util.Scanner;
public class MainClient {
    public static void main(String[] args) {
        //create a object in scanner;

        Scanner sc = new Scanner(System.in);
        Client cl= new Client();

        System.out.print("Employee  name:--");
        String name =sc.next();
        System.out.print("Employee contact number:-");
        long mobile =sc.nextLong();
        System.out.print("Employee Email_Id:-");
        char Email_Id=sc.next().charAt(0);
        System.out.print("Employee id:-");
        int Employee_Id =sc.nextInt();

        System.out.println("============output================");

        cl.name=name;
        cl.mobile=mobile;
        cl.Email_Id=Email_Id;
        cl.Employee_Id=Employee_Id;
        cl.info();

    }
}
