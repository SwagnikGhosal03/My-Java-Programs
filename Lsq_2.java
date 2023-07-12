import java.util.Scanner;

public class Lsq_2 {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("enter the array elements");
    for (int i = 0; i < arr.length; i++) {
        arr[i]=in.nextInt();
    }
    System.out.println("the minimum value is :" +minimum(arr) );
    in.close();
    }
    static int minimum(int arr[]){
        int min=arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(min>arr[i]){
         min=arr[i];
        }
    }
   return min;
   
}
}