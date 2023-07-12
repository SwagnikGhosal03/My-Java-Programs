import java.util.Scanner;
public class Binarysearch {
    public static void main(String[] args) {
  Scanner in =new Scanner(System.in);
  int arr[]=new int[8];
  System.out.println("enter the array elements");
  for (int i = 0; i < arr.length; i++){
    arr[i]=in.nextInt();
}
    System.out.println("enter the element to be searched");
    int target=in.nextInt();
    System.out.println(search(arr, target));
    in.close();
    }
    static int search(int arr[],int target){
        int start=0,end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (target>arr[mid]) {
               start=mid+1; 
            }
            else if (target<arr[mid]) {
                end=mid-1;
            }
            else return mid;
           
        }
        return -1;
     }
            
    }
