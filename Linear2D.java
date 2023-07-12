import java.util.Arrays;
import java.util.Scanner;

public class Linear2D {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [][]arr=new int[3][3];
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("enter an element to search");
        int num=in.nextInt();
        int[] ans=search(arr, num);
        System.out.println(Arrays.toString(ans));
        in.close();
    }
    static int[] search(int arr[][],int num){
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if(arr[i][j]==num) {
                 return new int[] {i,j};
               }
            }
    }
     return new int[] {-1,-1};
    }
}