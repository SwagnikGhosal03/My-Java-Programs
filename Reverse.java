public class Reverse {
    public static void main(String[] args) {
        System.out.println(rev(457));
    }
    static double rev(int n){
        if(n<10){
            return n;
        }
     else return n%10*Math.pow(10, Math.log10(n))+rev(n/10);
    }
}