public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(sum(4567));
        System.out.println(product(230));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        else return n%10+sum(n/10);
    }
        static int product(int n){
        if(n%10==n){
            return n;
        }
        else return n%10*sum(n/10);
    }
}

