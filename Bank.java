import java.util.Scanner;
import Errors.Banking;

class Customer {
    String acc="211FA04563";
    double bal=100000.00;
    void show(){
        System.out.println("Account No:"+acc+" Balance: "+bal);
    }
    void withdraw(double input){
        bal-=input;
        System.out.println(input+" is withdrawn from your account.");
    }
    void deposit(double add){
        bal+=add;
    }
}

public class Bank {
    public static void main(String []args){
        double var;
        int choice=1;
        String menu="\n0-Exit\t1-Display\t2-Deposit\t3-Withdraw\nEnter your choice: ";
        Scanner read = new Scanner(System.in);
        Customer obj = new Customer();
        while(true){
            System.out.print(menu);
            choice = read.nextInt();
            if(choice==0){
                System.exit(2);
            }
            else if(choice==1){
                obj.show();
            }
            else if(choice==2){
                System.out.print("Enter the amount: ");
                var = read.nextDouble();
                obj.deposit(var);
            }
            else if(choice==3){
                System.out.print("Enter the amount: ");
                var= read.nextDouble();
                try{
                    if(var<= obj.bal){
                        obj.withdraw(var);
                    }
                    else{
                        throw new Banking("Insufficient funds");
                    }
                }
                catch (Banking e){
                    System.out.print(e.getMessage());
                }
            }
            else{
                System.out.print("Enter a valid choice.");
            }
        }
    }
}
