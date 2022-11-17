class SayWishes implements Runnable{
    String msg;
    Thread t;
    SayWishes(String msg){
        this.msg=msg;
        t=new Thread(this);
//        t.start();
    }
    public void run(){
//        System.out.println("Waiting.....");
        System.out.println(msg);
    }
}

public class Wish {
    public static void main(String []args){
        SayWishes wish1=new SayWishes("Good morning.");
        SayWishes wish2=new SayWishes("Welcome...");
        wish1.t.start();
        wish2.t.start();
        try{
            wish1.t.join();
            wish2.t.join();
        }
        catch (InterruptedException e){
            System.out.print("Main interruption");
        }
    }
}
