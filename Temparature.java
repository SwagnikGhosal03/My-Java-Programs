import java.util.Scanner;

public class Temparature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float c,f;
        System.out.println("enter temparature in celcius");
        c=input.nextFloat();
        f=(9/5)*c +32;
        System.out.println("the temparature in farenheit is: "+f);
        input.close();
    }
}
