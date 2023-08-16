package ClassFunction;

public class classFunction_03 {
    //without arg.and with return type
    //datatype functionname(){
    //    return value
    //}
    
    String Sname(){
        return "Sonu";
    }
    int sprice(){
        return 300;
    }
    public static void main(String[] args) {
        classFunction_03 obj=new classFunction_03();
        String name=obj.Sname();
        System.out.println(name);
        System.out.println(obj.sprice());
    }
}
