public class Maxwealth {
    public static void main(String[] args) {
        int arr[][]={{1,5},{7,3},{3,5}};
        System.out.println("the maximum wealth is :"+maximumwealth(arr));
    }
    static int maximumwealth(int arr[][]){
        int rowsum,max=0;
     for (int i = 0; i < arr.length; i++) {
        rowsum=0;
        for (int j = 0; j < arr[i].length; j++) {
            rowsum+=arr[i][j];
        }
    if (rowsum>max) {
        max=rowsum;
    }
    }
    return max;

    }
}
