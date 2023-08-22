package Project_Opps_class_obj;
import  java.util.Scanner;
class ATM{
    float balance;
    int PIN=1432;
        public void checkpin(){
            System.out.println("Enter Your pin:-");
            Scanner sc=new Scanner(System.in);
            int enterpin=sc.nextInt();
            if(enterpin==PIN){
                manu();
            }
            else {
                System.out.println("Enter Your pin:-");
                manu();
            }

        }

        public  void manu(){
            System.out.println("Enter Your Choice");
            System.out.println("1.Check A/c Balance:");
            System.out.println("2.Withdraw Money");
            System.out.println("3.Deposit Money");
            System.out.println("4.Exit");

            Scanner sc=new Scanner(System.in);
            int opt=sc.nextInt();

            if(opt==1){
                checkBalance();
            }
            else if(opt==2){
                WithdrawMoney();
            }
            else if(opt==3){
                DepositMoney();
            }
            else if(opt==4){
                return;
            }
            else {
                System.out.println("Enter Your valid Choice");
            }
        }

        public  void checkBalance(){
            System.out.println("Balance:-"+balance);
            manu();
        }

        public void WithdrawMoney(){
            System.out.println("Enter Amount to Withdraw:-");
            Scanner sc=new Scanner(System.in);
            float amount = sc.nextFloat();
            if(amount>balance){
                System.out.println("Insufficient Balance");
            }
            else {
                balance = balance-amount;
                System.out.println("Money Withdraw Successful");
            }
            manu();
        }

        public void DepositMoney(){
            System.out.println("Enter the amount:-");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextFloat();
            balance = balance+amount;
            System.out.println("Money Deposited Successfully");
            manu();
        }
}



public class ATM_Machine {
    public static void main(String[] args) {
///obj atm

        ATM obj=new ATM();
        obj.checkpin();
    }
}
