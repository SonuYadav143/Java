package Poly_Fun_Overloading;

public class Polymorphism {

    //Polymorphism Concepts.
    //Polymorphism Overloading & overriding.

    void CourseInfo(){
        System.out.println("Course :- Java .Net Python C# ");
    }

    void CourseInfo(String Topic){
        System.out.println("Course Join Course Name:-"+Topic);
    }
    void CourseInfo(String EmailID,long Mob){
        System.out.println("Student_Email_Id:-"+EmailID);
        System.out.println("Student Contact Number:--"+Mob);
    }

    void  CourseInfo(int studentId, String studentName){
        System.out.println("Course Student Id: -"+studentId);
        System.out.println("Course Student Name :--"+studentName);
    }

}
