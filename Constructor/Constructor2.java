package Constructor;

public class Constructor2 {
    public Constructor2(String empName,String city,int salary){
        System.out.println("Employee Name:-"+empName);
        System.out.println("Employee City:-"+city);
        System.out.println("Employee salary:-"+salary);
    }

    public static void main(String[] args) {
        Constructor2 cs=new Constructor2("Sonu_Yadav","Mumbai",25000);
        Constructor2 cs1=new Constructor2("Suraj_Jha","Delhi",4000);

    }
}
