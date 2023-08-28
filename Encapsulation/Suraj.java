package Encapsulation;

public class Suraj {
    String Name;
    String Address;
    String Email;
    long Mobile;

    public Suraj(String Name, String Address, String Email, long Mobile) {

       this.Name=Name;
       this.Address=Address;
       this.Email=Email;
       this.Mobile=Mobile;
    }
    public String getName(){
        return Name;
    }
    public String getAddress(){
        return  Address;
    }
    public String getEmail(){
        return Email;
    }
    public  long getMobile(){
        return Mobile;
    }
}
