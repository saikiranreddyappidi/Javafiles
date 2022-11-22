import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FrequencyCalculator {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();
        StringTokenizer tokenizer_string = new StringTokenizer(str);
        System.out.print("Enter the word to count: ");
        String find=sc.next();
        int sum=0;
        while(tokenizer_string.hasMoreTokens()){
            if(Objects.equals(find, tokenizer_string.nextToken())){
                sum+=1;
            }
        }
        System.out.print("Frequency: "+sum);
    }
}
