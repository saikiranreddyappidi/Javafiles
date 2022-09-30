//package Token;
import java.util.*;

public class Tokenizers {
    public static void main(String []args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a character through which the string can be separated : ");
        String symbol = read.nextLine();
        System.out.print("Enter the numbers : ");
        String line_string = read.nextLine();
        try {
            int sum = 0;
            StringTokenizer tokenizer_string = new StringTokenizer(line_string,symbol,false);
            while(tokenizer_string.hasMoreTokens()){
                String temp = tokenizer_string.nextToken();
                System.out.println(temp);
                sum += (Integer.parseInt(temp));
            }
            System.out.println("Sum of given integers: "+sum);
        }
        catch (Exception e){
            System.out.println("Wrong input given");
            throw new ArithmeticException();
        }
    }
}
