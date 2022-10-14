import java.util.Scanner;

class exceptions {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a= scan.nextInt();
        b= scan.nextInt();
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception occurred");
            throw new ArithmeticException();
        }
        finally {
            System.out.println("Program completed.");
        }
    }
}
