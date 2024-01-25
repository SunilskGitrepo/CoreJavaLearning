package Jan25;
import java.util.Scanner;

public class LAB007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your item code:");
        int item = sc.nextInt();
         switch(item) {
             case 001 -> System.out.println("It is a laptop!");
             case 002 -> System.out.println("It is a Desktop!");
             case 003, 004, 007 -> System.out.println("It is a mobile phone!");
         }
                 System.out.println("Enter a valid code");

    }
}
