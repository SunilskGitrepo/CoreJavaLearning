package Jan23;
import java.util.Scanner;

public class LAB004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser type:");
        String browser = sc.next();
        switch (browser) {

            case "chrome":
                System.out.println("Execute chrome code");
                break;
            case "firefox":
                System.out.println("Execute firefox code");
                break;
            case "edge":
                System.out.println("Execute edge code");
                break;
            case "opera":
                System.out.println("Execute opera code");
                break;
            default:
                System.out.println("Please enter valid browser");
        }
    }
}
