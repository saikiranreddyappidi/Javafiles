import java.util.Scanner;

public class gregorian {
    public static void main(String[] args){
        int y1,y2,number_of_days,day;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first year : ");
        y1=sc.nextInt();

        System.out.print("Enter the second year : ");
        y2=sc.nextInt();

        number_of_days=(y1-y2)*365 + (y1-y2)/4;
        day=number_of_days%7;

        if (day==0)
            System.out.println("Monday");


        else if (day==1)
            System.out.println("Tuesday");

        else if (day==2)
            System.out.println("Wednesday");

        else if (day==3)
            System.out.println("Thursday");

        else if (day==4)
            System.out.println("Friday");

        else if (day==5)
            System.out.println("Saturday");

        else if (day==6)
            System.out.println("Sunday");
    }
}
