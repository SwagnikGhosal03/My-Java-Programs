import java.util.Scanner;
public class Alphabet {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char ch;
    System.out.println("enter a character");
    ch=input.next().charAt(0);
    if (ch>='a'&& ch<='z') {
        System.out.println(" It is lowercase character");
    }
    else if(ch>='A'&& ch<='Z'){
        System.out.println(" It is an uppercase character");
    }
    input.close();
   } 
}
