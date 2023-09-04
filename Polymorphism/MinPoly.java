package Polymorphism;

public class MinPoly {
    public static void main(String[] args) {
        Overloding obj = new Overloding();
        obj.CourseInfo();
        obj.CourseInfo(99);
        obj.CourseInfo("Polymorphism");
        obj.CourseInfo(45000,"OverLoding");

     Cons_Overloding consOverloding = new Cons_Overloding();
     Cons_Overloding consOverloding1 = new Cons_Overloding(200);
     Cons_Overloding consOverloding2 = new Cons_Overloding("Coffee");
     Cons_Overloding consOverloding3 = new Cons_Overloding(3);

     consOverloding.info();

    }
}
