package srcJAN22;

import java.util.Scanner;

public class LAB002 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = sc.nextInt();
         if(score >= 90 && score<=100){
             System.out.println("Grade A");
        }else if(score >= 80 && score<=89 ) {
             System.out.println("Grade B");
         }
         else if(score >= 70 && score <= 79){
            System.out.println("Grade C");
        }
        else if(score >= 60 && score <= 69){
            System.out.println("Grade D");
        }
        else if(score >= 50 && score <= 59){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
        // else if()

    }
}
