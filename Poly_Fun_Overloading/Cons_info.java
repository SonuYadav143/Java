package Poly_Fun_Overloading;

public class Cons_info {

    //Constructor Overloadding...

    Cons_info(){
        System.out.println("This is My Cons_info class:--");
    }

    Cons_info(String Name){
        System.out.println("Student Name :--"+Name);
    }
    Cons_info(int Id){
        System.out.println("Student Id :-"+Id);
    }
    Cons_info(long Mob , String EmailID){
        System.out.println("Student Mobile Number:-"+Mob);
        System.out.println("Student  EmailId :--"+EmailID);
    }
    void info(){
        System.out.println("welcome");
    }

}
