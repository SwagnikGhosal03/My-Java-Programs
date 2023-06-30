import java.util.Scanner;

public class Evenodd {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int a,b,c;
    System.out.println("enter 3 numbers");
    a=in.nextInt();
    b=in.nextInt();
    c=in.nextInt();
    int max=max(a,b,c);
    System.out.println("the maximum number is " + max);
    int min=min(a,b,c);
    System.out.println("the minimum number is " + min);
    in.close();
}
static int max (int a,int b,int c){
if (a>b && a>c) 
    return a;
if (b>a && b>c) 
    return b;
if (c>a && c>b) 
    return c;
    return 0;
} 
static int min(int a,int b , int c){
    if (a<b && a<c) 
    return a;
if (b<a && b<c) 
    return b;
if (c<a && c<b) 
    return c;
    return 0;
}   
}