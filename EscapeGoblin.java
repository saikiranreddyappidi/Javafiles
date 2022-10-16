import java.util.Scanner;
class Goblin{
    double distance(float r,float s){
        return r*Math.PI*s/4;
    }
}

class Boat{
    double distance(float r,float s){
        return 0.75*r*s;
    }
}

public class EscapeGoblin {
    static double Time(double distance,double speed){
        return distance/speed;
    }
    public static void main(String []args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the radius of lake: ");
        float radius = read.nextFloat();
        System.out.print("Enter the speed of Human Boat: ");
        float speed = read.nextFloat();
        Goblin g = new Goblin();
        double G_dist = g.distance(radius,speed);
        Boat b = new Boat();
        double B_dist = b.distance(radius,speed);
        System.out.println("Distance Travelled by Goblin: "+G_dist);
        System.out.println("Distance Travelled by Boat(human): "+B_dist);
        double G_time=Time(G_dist,speed);
        System.out.println("Time taken by Goblin: "+G_time);
        double B_time=Time(B_dist,speed);
        System.out.println("Time taken by Boat(Human): "+B_time);
        System.out.println("Extra time get by human: "+(G_time-B_time));
    }
}
