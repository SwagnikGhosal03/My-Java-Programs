import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r,c,a;
        System.out.println("enter the radius");
        r=in.nextDouble();
        a=area(r);
        c=circumference(r);
        System.out.println("area: "+a);
        System.out.println("circumference: "+c);
        in.close(); 
    }
    static double area(double r){
        double a=3.14 * r *r;
        return a;
    }
      static double circumference(double r){
        double c=2*3.14*r;
        return c;
    }
}
