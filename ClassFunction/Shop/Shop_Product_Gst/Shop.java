package ClassFunction.Shop.Shop_Product_Gst;
import java.util.Scanner;
public class Shop {
   int tax(int price ,int gst){
    gst=(price*gst)/100;
    int mrp=gst+price;
    return mrp;
   }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
Shop obj=new Shop();

System.out.println("Enter price:-");
int price=sc.nextInt();

System.out.println("Enter your Gst:-");
int gst=sc.nextInt();
System.out.println("Enter your gst");
gst=sc.nextInt();

/* System.out.println("final price:-");
mrp = sc.nextInt(); */

}

}
