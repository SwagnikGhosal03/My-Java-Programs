import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
    Scanner input= new Scanner (System.in);
    System.out.println("enter a number");
    int n,rev=0,rem;
    n=input.nextInt();
    int num=n;
    do {
        rem=n%10;
        rev=rev*10+rem;
        n/=10;
    } while (n!=0);
    // System.out.println("the reverse of "+ num +" is " +rev);
    if (rev==num) {
        System.out.println(" "+num+" is a palindrome");
    } else {
         System.out.println(" "+num+" is not a palindrome");
    }
    input.close();
    }
}