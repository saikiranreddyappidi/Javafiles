class foo{
    String msg;
    foo(String msg){
        this.msg=msg;
    }
    public void first(){
        System.out.println("first"+msg);
        try{
            Thread.sleep(1000);
            System.out.println(msg+"-1");
        }
        catch (Exception e){
            System.out.print("Error");
        }
    }
    public void second(){
        System.out.println("second"+msg);
        try{
            Thread.sleep(1000);
            System.out.println(msg+"-2");
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    public void third(){
        System.out.println("third"+msg);
        try{
            Thread.sleep(1000);
            System.out.println(msg+"-3");
        }
        catch (Exception e){
            System.out.print("Error");
        }
    }
}
public class async extends Thread{
    String msg;
    async(String msg){
        this.msg=msg;
    }
    synchronized public void run(){
        foo obj=new foo(msg);
        System.out.println("--1"+msg+"--");
        obj.first();
        System.out.println("--2"+msg+"--");
        obj.second();
        System.out.println("--3"+msg+"--");
        obj.third();
    }
    public static void main(String []args){
        async asy1=new async("Hello");
        Thread obj1=new Thread(asy1);
        obj1.start();
        async asy2=new async("Hi");
        Thread obj2=new Thread(asy2);
        obj2.start();
    }
}
