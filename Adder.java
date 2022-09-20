import java.util.Scanner;

class Arithmetic{
    int add(int a,int b){
       int sum = a+b;
        return sum;
    }
    float add(float a,float b){
        float sum = a+b;
        return sum;
    }
}

public class Adder extends Arithmetic{
    public static void main(String []args){
//        System.out.print("Enter two numbers: ");
//        Scanner scan = new Scanner(System.in);
//        int x = scan.nextInt();
//        int y = scan.nextInt();
        Arithmetic obj = new Adder();
        int result1 = obj.add(3,5);
        float result2 = obj.add(2.5f,1.7f);
        System.out.println("Sum of digits of int: "+result1);
        System.out.println("Sum of digits of float: "+result2);
    }
}
