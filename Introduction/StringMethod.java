public class StringMethod {
    public static void main(String[] args) {
        String s="Sonu Yadav";
        System.out.println("String values:-="+s);
        System.out.println("s.toLowerCase()="+s.toLowerCase( ));
        System.out.println("s.toUpperCase()="+s.toUpperCase());
        System.out.println("s.trim()="+s.trim());
        System.out.println("s.charAt(3)="+s.charAt(3));
        System.out.println("s.length()="+s.length());
        String s1="Hello";
        System.out.println("s1="+s1);

        s1=s.intern();
        System.out.println("s1=s.interrn()="+s1);
        int a=10;
        String s2=String.valueOf(a);
        System.out.println("User of value valueOf()="+s2+10);
        String s3=s1.replace("u", "a");
        System.out.println("use of replace()="+s3);
    }
    
}
