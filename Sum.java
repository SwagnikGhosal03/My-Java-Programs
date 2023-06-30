import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=input.nextInt();
        System.out.println("enter 2nd number");
        int b=input.nextInt();
        int sum=a+b;
        System.out.println("the sum is "+sum);
        input.close();
    }
}
