import java.util.Arrays;

public class Bubblesort{
    public static void main(String[] args) {
        int arr[]={23,67,76,69,34,7};
       bubble(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void bubble(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                }
            }
        }
    }
}