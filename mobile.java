import java.util.Scanner;

class menu{
    public void mainmenu(){
        System.out.println("a.Know my balance   b.Know my validity    c.Know no.of free calls   d.More");
        System.out.println("Enter 0 to exit.");
    }
    public void balance(){
        System.out.println("Rs:97.50");
    }
    public void validity(){
        System.out.println("22/05/2023");
    }
    public void freecalls(){
        System.out.println("There are only 51 free calls left.");
    }
    public void more(){
        System.out.println("1.Prepaid bill request\n" +
                "2.Customer Preferences\n" +
                "3.GPRS activation\n" +
                "4.Special Message offers\n" +
                "5.Special GPRS offers\n" +
                "6.3G activation\n" +
                "7.Go to previous menu\n");
        System.out.println("Enter 0 to exit.");
    }
}


public class mobile {
    public static void main(String []args){
        System.out.println("Welcome to Powered Air service");
        menu obj=new menu();
        Scanner scan=new Scanner(System.in);
        boolean t=true;
        while(t){
            obj.mainmenu();
            System.out.print("Enter your choice: ");
            char inp=scan.next().charAt(0);
            if(inp=='a'){
                obj.balance();
            }
            else if(inp=='b'){
                obj.validity();
            }
            else if(inp=='c'){
                obj.freecalls();
            }
            else if(inp=='d'){
                boolean mo=true;
                while(mo){
                    obj.more();
                    System.out.print("Enter your choice: ");
                    char men=scan.next().charAt(0);
                    if(men=='0'){
                        mo=false;
                        t=false;
                    }
                    else if(men=='7'){
                        mo=false;
                    }
                    else{
                        System.out.println("Your required services are temporarily unavailable.");
                    }
                }
            }
            else if(inp=='0'){
                t=false;
            }
        }
    }
}
