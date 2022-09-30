import java.util.Scanner;
import java.util.stream.StreamSupport;

interface AdvancedAlgorithm{
    int divisor_sum(int n);
}


public class Caculator implements AdvancedAlgorithm {
    @Override
    public int divisor_sum(int n) {
        int t=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                t+=i;
                System.out.print(i+" ");
            }
        }
        return t;
    }
    public static void main(String []args){
        Caculator obj = new Caculator();
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("Sum of all divisors of "+n+" is "+obj.divisor_sum(n));
    }
}
