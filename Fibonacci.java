public class Fibonacci{
    public static void main(String[] args) {
       int a=fibo(6);
       System.out.print(a);
    }
    static int fibo(int n){
      if (n<2) {
        return n;
      }
      else return fibo(n-1)+fibo(n-2);
    }
}