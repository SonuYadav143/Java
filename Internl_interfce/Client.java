package Internl_interfce;
interface sun{
    void website();
    void developer();
}
abstract class sonu implements sun{
    public  void website(){
        System.out.println("this is my internal_:-");
    }
}
class ajay extends sonu{
    public  void developer(){
        System.out.println("this is my extends class:--- ");
    }
}
public class Client {
    public static void main(String[] args) {
        ajay sc = new ajay();
        sc.developer();
        sc.website();
    }

}
