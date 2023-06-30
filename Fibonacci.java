import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,a=0,b=1,c=0;
        System.out.println("enter the number of terms");
        n=input.nextInt();
        System.out.println("the fibonaccci series is: ");
        for(int i=0;i<n;i++){
        System.out.println(c);
           c=a+b;
           b=a;
           a=c;        
        }
        input.close();
    }
}
