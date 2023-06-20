import java.util.Scanner;

abstract class shape{
    Scanner sc = new Scanner(System.in);

    abstract public double area();
}
class cicle5 extends shape{
    double r = sc.nextDouble();
    @Override
    public double area(){
        return Math.PI*r*r;
    }
}
class rectangle5 extends shape{
    double l = sc.nextDouble();
    double w = sc.nextDouble();
    @Override
    public double area(){
        return l*w;
    }
}
class cube extends shape{
    double l = sc.nextDouble();
    @Override
    public double area(){
        return 6*l*l;
    }
}
class cylinder9 extends shape{
    double r = sc.nextDouble();
    double h = sc.nextDouble();
    @Override
    public double area(){
        return (2*Math.PI*r*h)+(2*Math.PI*r*r);
    }
}
public class Abstract_Classes {

    public static void main(String[] args) {
        System.out.println("Enter value of radius of circle");
        cicle5 cir = new cicle5();
        System.out.printf("The area of circle is %.2f",cir.area());
        System.out.println(".");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter value of length of side of rectangle\n");
        System.out.println("Enter value of width of side of rectangle");
        rectangle5 rec = new rectangle5();
        System.out.println("The area of rectangle is "+rec.area()+".");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter value of length side of cube");
        cube cu = new cube();
        System.out.println("The area of cube is "+cu.area()+".");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter value of radius cylinder\n");
        System.out.println("Enter value of height of cylinder");
        cylinder9 cyl = new cylinder9();
        System.out.printf("The area of cylinder is %.2f",cyl.area());
        System.out.println(".");
    }
}
