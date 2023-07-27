public class Sumrev {
    public static void main(String[] args) {
        System.out.println(sum(1));
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else return n+sum(n-1);
    }
}
