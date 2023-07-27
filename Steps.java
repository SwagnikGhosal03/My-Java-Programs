public class Steps {
    public static void main(String[] args) {
        System.out.println(steps(8));
    }
    static int steps(int n){
        return helper(n,0);
    }
    private static int helper(int n,int count) {
       if(n==0){
        return count;
       }
       if(n%2==0){
        return helper(n/2,count=count+1);
       }
       return helper(n-1,count=count+1);
    }
}
