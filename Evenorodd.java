import java.util.Scanner;
public class Evenorodd {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int a;
        System.out.println("input a number");
        a=input.nextInt();
        if (a%2==0) {
           System.out.println("the number is even");
        } else {
        System.out.println("the number is odd");
        }
        input.close();
    }
}
