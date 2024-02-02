package Jan31;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sub = new String[5];
        double marks[] = {87,95,76,90,28};
        System.out.println("Enter the first subject:");
        sub[0] = sc.next();
        System.out.println(sub[0] +"->" + marks[0]);
        System.out.println("Enter the second subject:");
        sub[1] = sc.next();
        System.out.println(sub[1] +"->" + marks[1]);
        System.out.println("Enter the third subject:");
        sub[2] = sc.next();
        System.out.println(sub[2] +"->" + marks[2]);
        System.out.println("Enter the fourth subject:");
        sub[3] = sc.next();
        System.out.println(sub[3] +"->" + marks[3]);
        System.out.println("Enter the fifth subject:");
        sub[4] = sc.next();
        System.out.println(sub[4] +"->" + marks[4]);

        for(int i=0 ; i<sub.length ; i++) {
            if(marks[i] < 30) {
                System.out.println("You are failed in" + " " + sub[i]);

            }
        }
        sc.close();
    }

}
