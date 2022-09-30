abstract class Shape{
    abstract int noofsides() ;
}
class Trapezoid extends Shape{
    int noofsides(){
        System.out.println("No.of sides of Trapezoid is 4");
        return 4;
    }
}
class Triangle extends Shape{
    int noofsides(){
        System.out.println("No.of sides of Triangle is 3");
        return 3;
    }
}
class Hexagon extends Shape{
    int noofsides(){
        System.out.println("No.of sides of Hexagon is 6");
        return 6;
    }
}

public class quadrilateral {
    public static void main(String []args){
        Trapezoid trap = new Trapezoid();
        System.out.println(trap.noofsides());
        Triangle tri = new Triangle();
        System.out.println(tri.noofsides());
        Hexagon hexa = new Hexagon();
        System.out.println(hexa.noofsides());
    }
}
