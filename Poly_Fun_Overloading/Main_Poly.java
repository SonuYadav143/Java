package Poly_Fun_Overloading;

public class Main_Poly {

    public static void main(String[] args) {

        //Polymorphism Overloading 

        Polymorphism sc = new Polymorphism();

        sc.CourseInfo();

        sc.CourseInfo("Java_Full");

        sc.CourseInfo("SonuYadav4315@gmail.com", 8879419985l);

        sc.CourseInfo(143, "Sonu_Yadav");

        //Constructor Overloadding...
        // Con_info
        Cons_info so = new Cons_info("Ajay_Yadav");
        so.info();
        Cons_info so1 = new Cons_info("Ajay");
        so1.info();
        Cons_info so2 = new Cons_info(123);
        so2.info();
        Cons_info so3 = new Cons_info(8879419985l,"ajay123@gmail.com");
        so3.info();

    }
}
