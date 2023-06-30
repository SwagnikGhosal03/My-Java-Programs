import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("what is your roll no");
        int rollno=input.nextInt();
        System.out.println("your roll no is: "+rollno);
        System.out.println("what is your name");
        String name=input.nextLine();
        System.out.println(name);
        System.out.println("enter a float number");
        float num=input.nextFloat();
        System.out.println(num);
        input.close();
    }
}
