package Functions;
import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int b = a / 2;
        int flag = 0;
        if (a == 0 || a == 1) {
            System.out.println("Not a prime number");
        } else {
            for (int i = 2; i <= b; i++) {
                if (a % i == 0) {
                    System.out.println("Not prime number");
                    flag = 1;
                    break;
                }
            }
        }

            if (flag == 0) {
                System.out.println("prime number");
            }

        }
    }


