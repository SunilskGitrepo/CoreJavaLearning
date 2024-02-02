package Jan30;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        long fact = 1;
        int i = 1;  //Initialization - 1
        while (i <= number) {  //Condition - 2
            fact = fact * i;  //Body - 3
            i++;    //Increment/Decrement - 4
        }
        System.out.println(fact);

        sc.close();
    }
}
