import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float ans=0;
        while(true){
            System.out.println("enter the operation");
            char op=sc.next().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.println("enter two numbers");
                float num1=sc.nextFloat();
                float num2=sc.nextFloat();
                if (op=='+') {
                    ans=num1+num2;
                }
                if (op=='-') {
                    ans=num1-num2;
                }
                if (op=='*') {
                    ans=num1*num2;
                }
                if (op=='/') {
                    if(num2!=0)
                    ans=num1/num2;
                }
                if (op=='%') {
                    ans=num1%num2;
                }
            }
        else if (op=='X'||op=='x') {
            break;
        }
        else {
            System.out.println("invalid operation");
        }
        System.out.println(ans);
        }
        sc.close();
    }
}
