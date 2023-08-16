package ClassFunction;

public class classFunction_04 {

    //with arg .and with result type

    int tax(int price,int gst){
        gst=(price*gst)/100;
        int mrp =gst+price;
        return mrp;
    }
    public static void main(String[] args) {
        classFunction_04 obj=new classFunction_04();
        int final_price=obj.tax(1200,18);
        System.out.println(final_price+20);
    }
    
}
