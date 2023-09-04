package functions.java;

public class function3 {


    String setName(){
        return "Aditya";
    }
    int setPrice(){
        return 250;
    }

    public static void main(String[] args) {
        function3 obj = new function3();
        String name = obj.setName();
        System.out.println(name);
        System.out.println(obj.setPrice());
          }
}

