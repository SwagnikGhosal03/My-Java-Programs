import java.util.Scanner;

public class Lsq_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int []arr={14,12,-7,3,14,28};
        System.out.println("enter the element to be searched");
        int num=in.nextInt();
        System.out.println(search(num, arr));
        in.close();
    }
    static int search(int num,int arr[]){
      for (int i = 1; i < 5;i++) {
        if (arr[i]==num) {
            return i;
        } 
      }
      return -1;
    } 
}
