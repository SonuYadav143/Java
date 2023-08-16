package ClassFunction;

public class classFunction_02 {
    //with arg.and without return type
    void info(String name,int age,float height){
        System.out.println("Name:-"+name);
        System.out.println("Age:-"+age);
        System.out.println("Height:-"+height);
    }
    public static void main(String[] args) {
        classFunction_02 obj=new classFunction_02();
        obj.info("Sonu",56,5.7f);
        System.out.println();
          obj.info("Suraj",50,5.1f);
          System.out.println();
            obj.info("Lion",36,5.4f);
        

    }
}
