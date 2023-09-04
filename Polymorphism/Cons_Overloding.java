package Polymorphism;

public class Cons_Overloding {

     Cons_Overloding(){
         System.out.println("Client Nme :Joy");
     }
    Cons_Overloding(int ClientId){
        System.out.println("Client ID:"+ClientId);
    }
    Cons_Overloding(String ProductNme){
        System.out.println("Product Nme :"+ProductNme);
    }
    void info(){}
}
