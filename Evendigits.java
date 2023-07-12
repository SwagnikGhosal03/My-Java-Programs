public class Evendigits {
    public static void main(String[] args) {
        int arr[] = { 18, 124, 9, 1764, 98, 1 };
        System.out.println(digits(arr));
    }

    static int digits(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int n){
        int count=0;
        while (n>0) {
            count++;
            n/=10;
        }
        if(count%2==0){
          return true; 
        }
        else return false;
    }
}
