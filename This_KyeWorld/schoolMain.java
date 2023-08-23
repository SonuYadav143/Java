package This_KyeWorld;

public class schoolMain {
    public static void main(String[] args) {
        School sc = new School();
        sc.setStudentName("Sonu_Yadav");
        sc.setAddress("Malad east:-");
        sc.setAge(25);
        sc.setMobile(8879419985l);

        System.out.println(sc.getStudentName());
        System.out.println(sc.getAddress());
        System.out.println(sc.getAge());
        System.out.println(sc.getMobile());

    }
}
