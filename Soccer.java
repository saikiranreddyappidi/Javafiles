class Sport{
    void getname(){
        System.out.println("Chess");
    }
    void no_of_members(){
        System.out.println(10);
    }
}


public class Soccer extends Sport{
    @Override
    void getname() {
        System.out.println("UNO");
    }
    @Override
    void no_of_members() {
        System.out.println(7);
    }
    public static void main(String []args){
        Sport obj = new Soccer();
//        Sport obj = new Soccer();
        obj.no_of_members();
        obj.getname();
    }
}
