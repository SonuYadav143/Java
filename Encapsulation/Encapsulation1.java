package Encapsulation;

public class Encapsulation1 {
    int Price;
    String Name;
    public Encapsulation1(int Price,String Name){
        this.Price=Price;
        this.Name=Name;
    }
    public int getPrice(){
        return Price;
    }
    public  String getName(){
        return  Name;
    }

}
