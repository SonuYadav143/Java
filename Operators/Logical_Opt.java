package Operators;

public class Logical_Opt {
    public static void main(String[] args) {
        boolean s=true;
        boolean t=false;

        System.out.println("S values is true:"+s);
        System.out.println("T values is false:"+t);

        System.out.println("S valus  && T:"+(s&&t));
        System.out.println("S values || T:"+(s||t));
        System.out.println("!(s&&t) S values  T:"+!(s&&t));

    }
    
}
