package functions.java;

public class function4 {

    int tax(int price ,int gst){
         gst=(price+gst)/100;
         int mrp=gst+price;
         return mrp;
    }

    public static void main(String[] args) {
        function4 obj= new function4();
        int final_price= obj.tax(1200 , 18);
        System.out.println(final_price);

    }
}
