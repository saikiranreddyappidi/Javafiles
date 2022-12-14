package ModuleBank;

class Center{
    String st;
    String next;
    Center(String st,String next){
        this.st=st;
        this.next=next;
    }
    void display() throws InterruptedException {
        System.out.println("Green for: "+st);
        System.out.println("Red for other ways");
        Thread.sleep(2000);
        System.out.println("Yellow for: "+next);
        Thread.sleep(1000);
        System.out.println("Red for : "+st);
    }
}


class Traffic implements Runnable{
    Center center;
    Thread t;
    int i=0;
    String []arr={"Juanda East","Katamso South","Juanda West","Katamso North"};
    Traffic(){
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        while (true){
            try {
                center=new Center(arr[i],arr[(i+1)%4]);
                center.display();
                i=(i+1)%4;
                System.out.println("-------------------------");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class FourWayJunction {
    public static void main(String[] args) {
        new Traffic();
    }
}
