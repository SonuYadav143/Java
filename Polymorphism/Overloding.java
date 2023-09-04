package Polymorphism;

public class Overloding {

    void CourseInfo(){
        System.out.println("Course :-JDBC");
    }
    void CourseInfo(String Topic){
        System.out.println("Course Topic :"+Topic);
    }
    void CourseInfo(int Unit){
        System.out.println("Course Unit :"+Unit);
    }
    void CourseInfo(int fees,String UnitNme){
        System.out.println("Course Unit Fees :"+fees);
        System.out.println("Course Unit Nome :"+UnitNme);
    }

}
