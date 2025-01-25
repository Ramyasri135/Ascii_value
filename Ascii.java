
import java.util.Scanner;
    public class Ascii {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            char ch=sc.next().charAt(0);
            int asciivalue=(int) ch;
            System.out.println("value of " + ch +" is: "+ asciivalue);
            sc.close();
        }
    }