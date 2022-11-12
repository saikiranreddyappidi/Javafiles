import java.util.Scanner;
class student{
    String roll,name,course;
    int age;
    student(String roll,String name,String course,int age){
        this.roll=roll;
        this.name=name;
        this.course=course;
        this.age=age;
    }
    void checkAge(){
        try{
            if(15>age || age>21){
                throw new ShowError("AgeNotWithinRangeException");
            }
            else{
                System.out.println("Age ok");
            }
        }
        catch(ShowError e){
            System.out.println(e.getMessage());
        }
    }
    void checkName(){
        try{
            for(int i=0;i<name.length();i++){
                if(!Character.isAlphabetic(name.charAt(i)) && !Character.isWhitespace(name.charAt(i))){
                    throw new ShowError("NameNotValidException");
                }
                else if(i==name.length()-1){
                    System.out.println("Name Valid");
                }
            }
        }
        catch(ShowError e){
            System.out.println(e.getMessage());
        }
    }
}

public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your roll number: ");
        String roll=sc.nextLine();
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        System.out.print("Enter your course: ");
        String course=sc.next();
        student object=new  student(roll,name,course,age);
        object.checkAge();
        object.checkName();
        System.out.println("Completed");
    }
}
