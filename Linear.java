 import java.util.Scanner;

public class Linear {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int []arr=new int[5];
        int num;
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("enter an element to search");
        num=in.nextInt();
        int ans=search(num,arr);
        if(ans!=-1){
          System.out.println("the element is found at index :"+ans);
        }
        else System.out.println("element is not found in the array");
        in.close();

    }
    static int search(int num,int arr[]){
     for (int i=0; i<arr.length ;i++) {
        if (arr[i]==num){
            return i;
         }
        
    }
    return -1;
}
}

