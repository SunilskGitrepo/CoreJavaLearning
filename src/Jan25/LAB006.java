package Jan25;
import java.util.Scanner;

public class LAB006 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = user_input.next();
        System.out.println("Enter your age");
        int age  = user_input.nextInt();
        System.out.println("Enter your salary");
        double salary = user_input.nextInt();
        System.out.println("Your details are" + " "+ name + " " + age + " " + salary);
        user_input.close();
    }
}
